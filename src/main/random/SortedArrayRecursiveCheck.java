package main.random;

public class SortedArrayRecursiveCheck {

    private static void check(int[] arr, int start, int end) {
        if (start > end) {
            System.out.println("Array Is Sorted !");
            return;
        }
        if (arr[start] > arr[end]) {
            System.out.println("Array Is Not Sorted !");
            return;
        }
        check(arr, start + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        check(arr, 0, arr.length-1);
    }

}
