package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] str_arr = str.toCharArray();
        int[] result = new int[26];

        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
            for (int j = 0; j < str_arr.length; j++) {
                if (alphabet[i] == str_arr[j]) {
                    result[i] = j;
                    break;
                } else {
                    result[i] = -1;
                }

            }
            System.out.print(result[i] + " ");
        }


    }
}
