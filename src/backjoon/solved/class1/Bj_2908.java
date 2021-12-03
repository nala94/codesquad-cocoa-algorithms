package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_2908 {
    public static void main(String[] args) {
        // 세자리 수 n의 백의 자리 = n을 100으로 나눈 몫
        // 십의 자리 = n을 100으로 나눈 나머지를 10으로 나눈 몫
        // 일의 자리 = n을 10으로 나눈 나머지
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int a1, a2, a3, b1, b2, b3;
        a1 = a / 100;
        a2 = (a % 100) / 10;
        a3 = a % 10;

        b1 = b / 100;
        b2 = (b % 100) / 10;
        b3 = b % 10;

        int _a = a3 * 100 + a2 * 10 + a1;
        int _b = b3 * 100 + b2 * 10 + b1;
        if(_a > _b){
            System.out.println(_a);
        }else{
            System.out.println(_b);
        }


    }
}
