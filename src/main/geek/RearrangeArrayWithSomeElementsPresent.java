package main.geek;

import main.utils.Utility;

/**
 * Problem is given an array from i to n-1, you need to arrange all elements such that a[i] = i,
 * If some element is not present then replace with -1
 */
public class RearrangeArrayWithSomeElementsPresent {

    private static void reArrange(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            if (arr[i] >= 0 && arr[i] != i) {
                Utility.swap(i, arr[i], arr);
            } else {
                i++;
            }
        }
        Utility.print(arr);

    }


    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -1, 2, 5};

        reArrange(arr);

    }

}
