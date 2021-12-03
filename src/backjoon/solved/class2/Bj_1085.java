package backjoon.solved.class2;

import java.util.Scanner;

public class Bj_1085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();

        int pathX = 0;
        if(x <= w / 2){
            pathX = x;
        }else {
            pathX = w - x;
        }

        int pathY = 0;
        if(y <= h / 2){
            pathY = y;
        }else {
            pathY = h - y;
        }

        if(pathX > pathY){
            System.out.println(pathY);
        }else{
            System.out.println(pathX);
        }
    }
}
