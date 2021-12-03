package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_2475 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num;
        for(int i=0; i<5; i++){
            num = s.nextInt();
            sum += num * num;
        }
        int result = sum % 10;
        System.out.println(result);

    }
}
