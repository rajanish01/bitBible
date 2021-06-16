package main.geek;

import java.util.Scanner;

public class FindPairInSortedAndRotatedArray {

    public static int search(int A[], int l, int h, int key) {
        if (l > h) return -1;
        int mid = (l + h) / 2;

        if (A[mid] == key)
            return mid;

        if (A[l] <= A[mid]) {
            if (key >= A[l] && key <= A[mid])
                return search(A, l, mid - 1, key);
            return search(A, mid + 1, h, key);
        }

        if (key >= A[mid] && key <= A[h])
            return search(A, mid + 1, h, key);
        return search(A, l, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int result = search(A, 0, n - 1, key - A[i]);
            if(result == i)continue;
            if (result != -1) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

}
