package main.sorting;

public interface Sorting {

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    static void swap(int idx1, int idx2, int[] arr) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
