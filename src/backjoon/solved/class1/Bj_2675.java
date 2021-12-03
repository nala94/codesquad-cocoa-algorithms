package backjoon.solved.class1;

import java.util.Scanner;

public class Bj_2675 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i=0; i<t; i++){
            int r = s.nextInt();
            String str = s.next();
            char[] arr = str.toCharArray();
            String p ="";
            for(int j=0; j<str.length(); j++){
                for(int k=0; k<r; k++){
                    p += Character.toString(arr[j]);
//                     p += Character.toString(str.charAt(j));
                }
            }
            System.out.println(p);
        }
    }
}
