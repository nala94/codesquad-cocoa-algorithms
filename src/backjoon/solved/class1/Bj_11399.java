package backjoon.solved.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj_11399 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = s.nextInt();
        for(int i = 0; i<n; i++){
            arr.add(s.nextInt());
        }
        Collections.sort(arr);// 오름차순 정렬
        int sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum += arr.get(i) * (arr.size() - i);
        }
//        for(int i : arr){
//            sum += i * (arr.size() - i);
//        }

        System.out.println(sum);

    }
}
