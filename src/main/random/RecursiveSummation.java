package main.random;

public class RecursiveSummation {

    private static int add(int[] arr, int n) {
        if (n > 0)
            return arr[n] + add(arr, n - 1);
        return arr[0];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        System.out.println(add(arr, arr.length - 1));
    }

}
