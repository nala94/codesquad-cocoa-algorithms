package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        for(int i = 0; i<n; i++){
            int a = s.nextInt();
            if(a < x){
                System.out.print(a + " ");
            }
        }

    }
}
