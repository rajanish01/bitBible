package main.random;

import main.utils.Utility;

/**
 * Problem is to print all possible permutations of array of n length of 1's
 * Example : n=2 => {1,1}
 * Output : 00 01 10 11
 */

public class AllPossibleBinaryStrings {

    private int[] A;

    public AllPossibleBinaryStrings(int n) {
        this.A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = 1;
    }

    private void permute(int n) {
        if (n < 1) {
            Utility.print(A);
            System.out.println();
        } else {
            A[n - 1] = 0;
            permute(n - 1);
            A[n - 1] = 1;
            permute(n - 1);
        }
    }

    public static void main(String[] args) {
        int N = 3;
        AllPossibleBinaryStrings sample = new AllPossibleBinaryStrings(N);
        sample.permute(N);

    }
}
