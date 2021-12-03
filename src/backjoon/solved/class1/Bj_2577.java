package backjoon.solved.class1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj_2577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int num = a * b * c;
        int cnt = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        while(num > 0){
            arr.add(num % 10);
            num /= 10;
        }
        for(int i = 0; i<10; i++){
            for(int j : arr){
                if(i == j){
                    cnt += 1;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }

    }
}
