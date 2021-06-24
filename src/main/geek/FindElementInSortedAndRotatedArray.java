package main.geek;

import java.util.Scanner;

public class FindElementInSortedAndRotatedArray {

    public static int search(int A[], int l, int h, int key) {
        if (l > h) return -1;
        int mid = (l + h) / 2;

        if (A[mid] == key)
            return mid;

        //If left array is sorted
        if (A[l] <= A[mid]) {
            //key is in left half
            if (key >= A[l] && key <= A[mid])
                return search(A, l, mid - 1, key);
            return search(A, mid + 1, h, key);
        }
        //else right array will be sorted
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

        System.out.println(search(A, 0, n - 1, key));
    }

}
