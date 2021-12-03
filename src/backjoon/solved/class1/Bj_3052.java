package backjoon.solved.class1;

import java.util.HashSet;
import java.util.Scanner;

public class Bj_3052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> def = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = s.nextInt();
            def.add(n % 42);
        }
        System.out.println(def.size());
    }
}
