package home.ylitvinenko;

import java.util.Arrays;

public class MonkeyCounter {

    public static void main(String[] args) {
        monkeyCount(10);
        System.out.println(Arrays.toString(monkeyCount(10)));

    }

    public static int[] monkeyCount(final int n) {
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] += (i + 1);

        }

        return arr;
    }

}