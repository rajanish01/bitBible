/**
 * POINTS TO REMEMBER :-
 * 1.   Bubble Sort is the simplest sorting algorithm that works by repeatedly
 * swapping the adjacent elements, if they are in wrong order.
 * 2.   The inner loop outer bound should also shift based on outer loop inner bound,
 * as heavy elements are shifted to the last index in every iteration.
 * 3.   Complexity : n2
 */

package main.sorting;

import java.util.Scanner;

/**
 * @Author Rajanish
 * @date 29-oct-2020
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        boolean sorted = false;
        int i = 0;
        while (!sorted) {
            sorted = true;
            //Outer bound shifting based on outer loop inner bound, since heavy elements float at last index in every iteration
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Sorting.swap(j, j + 1, arr);
                    sorted = false;
                }
            }
            i++;
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
