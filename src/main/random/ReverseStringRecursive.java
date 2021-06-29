package main.random;

public class ReverseStringRecursive {

    public static String reverseWord(String str) {
        // Reverse the string str
        char[] cArray = str.toCharArray();
        reverse(cArray, 0, str.length() - 1);
        return String.valueOf(cArray);
    }

    private static void reverse(char[] str, int start, int end) {
        if (start >= end) return;

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "Geeks";
        System.out.println(reverseWord(s));
    }

}
