package main.random.hackerrank;

public class ConvertOneStringIntoAnother {

    static String isConvertible(String s, String t, int k) {
        if ((s.length() + t.length()) < k)
            return "Yes";

        int commonLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) break;
            commonLength++;
        }
        int d = k - s.length() - t.length() + 2 * commonLength;
        return d >= 0 && d % 2 == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String s = "qwerasdf";
        String t = "qwerbsdf";

        System.out.println(isConvertible(s, t, 6));
    }
}
