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
}
