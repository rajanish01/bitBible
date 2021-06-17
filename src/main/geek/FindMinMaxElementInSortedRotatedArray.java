package main.geek;

import main.utils.Utility;

import java.util.Scanner;

public class FindMinMaxElementInSortedRotatedArray {

    private static int findMin(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == arr[high])
                high--;
            else if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    private static int findMax(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] == arr[high])
                high--;
            else if (arr[low] > arr[mid])
                high = mid-1;
            else
                low = mid +1;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        Scanner sc = Utility.getScanner();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Min : " + findMin(arr, n));
        System.out.println("Max : " + findMax(arr, n));
    }

}
