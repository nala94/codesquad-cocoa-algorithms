package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()){
            int a = s.nextInt();
            int b = s.nextInt();
            if(s.hasNextInt()){
                System.out.println(a + b);

            }
        }
    }
}
