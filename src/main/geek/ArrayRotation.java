package main.geek;

import main.sorting.Sorting;
import main.utils.Utility;

import java.util.Scanner;

public class ArrayRotation {

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            Sorting.swap(start, end, arr);
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int d) {
        if (arr.length == 1) return;

        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void rotateRight(int[] arr, int d) {
        if (arr.length == 1) return;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Rotation Count : ");
        int d = sc.nextInt();
        d = d % n;

        int[] arrClone = arr.clone();
        System.out.println("\nLeft Rotation : ");
        rotateLeft(arrClone, d);
        Utility.print(arrClone);

        arrClone = arr.clone();
        System.out.println("\nRight Rotation : ");
        rotateRight(arrClone, d);
        Utility.print(arrClone);
    }
}
