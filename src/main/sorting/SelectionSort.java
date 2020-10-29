/**
 * POINTS TO REMEMBER :-
 * 1.  The selection sort algorithm sorts an array by repeatedly finding the minimum element
 * (considering ascending order) from unsorted part and putting it at the beginning.
 * 2.   Complexity : n2
 */

package main.sorting;

import java.util.Scanner;

/**
 * @Author Rajanish
 * @date 29-oct-2020
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            Sorting.swap(idx, i, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        Sorting.print(arr);
    }

}
