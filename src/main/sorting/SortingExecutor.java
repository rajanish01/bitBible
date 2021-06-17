package main.sorting;

import main.utils.Utility;

import java.util.Scanner;

public class SortingExecutor implements Sorting {

    @Override
    public void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Utility.swap(j, j + 1, array);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    @Override
    public void insertionSort(int[] array) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            //start from previous element
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                //shift each j to j+1 if key < j
                array[j + 1] = array[j];
                j--;
            }
            //j+1 stores correct position for key
            array[j + 1] = key;
        }
    }

    @Override
    public void selectionSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i + 1;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (array[minIndex] < array[i])
                Utility.swap(i, minIndex, array);
        }
    }

    @Override
    public void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid)
            temp[k++] = a[i++];

        while (j <= end)
            temp[k++] = a[j++];

        for (i = start; i <= end; i++)
            a[i] = temp[i - start];
    }

    @Override
    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pi = partition(array, start, end);

            quickSort(array, start, pi - 1);
            quickSort(array, pi + 1, end);
        }
    }

    private int partition(int[] a, int low, int high) {

        int i = low - 1;
        int pivot = a[high];

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                Utility.swap(j, i, a);
            }
        }
        Utility.swap(i + 1, high, a);
        return i + 1;
    }

    @Override
    public void heapSort(int[] array) {

    }

    public static void main(String[] args) {

        Scanner sc = Utility.getScanner();

        Utility.print("Enter List Size : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        Utility.print("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        Utility.print("\n1. Bubble Sort\n2. Insertion Sort\n3. Selection Sort\n4. Merge Sort\n5. Quick Sort\n6. Heap Sort\n");
        Utility.print("Enter Sorting Algorithm : ");
        int choice = sc.nextInt();
        SortingExecutor algorithm = new SortingExecutor();
        switch (choice) {
            case 1:
                algorithm.bubbleSort(array);
                break;
            case 2:
                algorithm.insertionSort(array);
                break;
            case 3:
                algorithm.selectionSort(array);
                break;
            case 4:
                algorithm.mergeSort(array, 0, array.length - 1);
                break;
            case 5:
                algorithm.quickSort(array, 0, array.length - 1);
                break;
            case 6:
                algorithm.heapSort(array);
                break;
            default:
                Utility.print("Wrong Input !");
        }
        Utility.print("\nSorted Array : ");
        Utility.print(array);
    }

}
