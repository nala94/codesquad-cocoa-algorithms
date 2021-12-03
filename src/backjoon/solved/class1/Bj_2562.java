package backjoon.solved.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bj_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<9; i++){
            arr.add(s.nextInt());
        }
        int max = arr.get(0);
        int numIndex = 1;
        for(int j = 0; j<arr.size(); j++){
            if(arr.get(j) > max){
                max = arr.get(j);
                numIndex = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(numIndex);

    }
}
