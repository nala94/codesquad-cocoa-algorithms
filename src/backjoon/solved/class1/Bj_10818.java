package backjoon.solved.class1;

import java.util.*;

public class Bj_10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[n - 1]);
//        List<Integer> arr = new ArrayList<>();
//        for(int i=0; i<n; i++){
//            arr.add(s.nextInt());
//        }
//        Collections.sort(arr);
//        System.out.println(arr.get(0) + " " + arr.get(n - 1));


    }
}
