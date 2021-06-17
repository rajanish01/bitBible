package main.sorting;

public interface Sorting {

    void bubbleSort(int[] array);

    void insertionSort(int[] array);

    void selectionSort(int[] array);

    void mergeSort(int[] array, int start, int end);

    void quickSort(int[] array, int start, int end);

    void heapSort(int[] array);

}
