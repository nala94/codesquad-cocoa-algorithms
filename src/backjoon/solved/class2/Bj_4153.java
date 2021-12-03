package backjoon.solved.class2;

import java.util.Scanner;

public class Bj_4153 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if (s.hasNextInt()) {
                rightAngleTest(a, b, c);
            }
        }
    }

    private static void rightAngleTest(int a, int b, int c) {

        int hypotenuse = a; // hypotenuse : 빗변
        int w = b;
        int h = c;
        if (a < b && b > c) {
            hypotenuse = b;
            w = a;
            h = c;
        }

        if (a < c && b < c) {
            hypotenuse = c;
            w = a;
            h = b;

        }

        if (hypotenuse * hypotenuse == w * w + h * h) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

    }

}
