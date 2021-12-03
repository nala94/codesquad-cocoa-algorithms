package programmers;

import java.util.Arrays;

public class Pg_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[index] = arr[i];
                index++;
            }
        }
        if(index == 0){
            answer[0] = -1;
        }
        Arrays.sort(answer);
        return answer;
    }
}
