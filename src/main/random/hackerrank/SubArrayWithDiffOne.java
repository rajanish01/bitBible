package main.random.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubArrayWithDiffOne {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);

        int maxLen = -1, len = 1;

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i + 1) - a.get(i) <= 1) len++;
            else {
                maxLen = Math.max(len, maxLen);
                len = 1;
            }
        }
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(4, 6, 5, 3, 3, 1));

        System.out.println(pickingNumbers(arr));
    }

}
