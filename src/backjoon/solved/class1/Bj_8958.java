package backjoon.solved.class1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bj_8958 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> ox;


        int n = s.nextInt();
        for (int i=0; i<n; i++){
            int sum = 0;
            String str = s.next();
            ox = new ArrayList<>(Arrays.asList(str.split("")));
            System.out.println(Arrays.toString(ox.toArray()));
            int cnt = 0;
            for(int j=0; j<ox.size(); j++){
                if(ox.get(j).equals("O")){
                    sum += 1 + cnt;
                    cnt++;
                }else{
                    cnt = 0;
                }
            }
            System.out.println(sum);

        }

    }
}
