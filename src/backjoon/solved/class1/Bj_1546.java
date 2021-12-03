package backjoon.solved.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bj_1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        List<Integer> score = new ArrayList<>();

        for(int i = 0; i<n; i++){
            int x = s.nextInt();
            score.add(x);
            sum += x;
        }
        Collections.sort(score);
        double max = score.get(n - 1);
        double _sum = (double) sum;
        double avg = _sum / (n * max) * 100;

        System.out.println(avg);

    }
}
