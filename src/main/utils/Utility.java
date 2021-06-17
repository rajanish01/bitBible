package main.utils;

import java.util.Scanner;

public class Utility {

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void print(String data) {
        System.out.println(data);
    }

    public static void swap(int idx1, int idx2, int[] arr) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
