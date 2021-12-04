package backjoon.solved.class2;

import java.util.Scanner;

public class Bj_10250 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int room = 0;


        for (int i = 0; i<t; i++) {
            int h = s.nextInt();
            int height = h + 1;
            int w = s.nextInt();
            int n = s.nextInt();

            int floor = 0;
            int roomNum = 0;

            if (n % h == 0) {
                floor = h;
                roomNum = n / h;
            }else{
                floor = n % h;
                roomNum = n / h + 1;
            }
            room = (floor * 100) + roomNum;
            System.out.println(room);
        }


    }

}
