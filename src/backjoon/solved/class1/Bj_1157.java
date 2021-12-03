package backjoon.solved.class1;

import java.util.*;

public class Bj_1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next().toUpperCase();

//        Map<Character, Integer> alphabet = new HashMap<>();

        // 알파벳 배열과 문자열 비교
        // 알파벳 배열과 같은 크기의 count 배열 생성
        // 같을 때 같은 인덱스의 count 배열 값 변경
        // 최대값을 찾고 하나면 인덱스의 알파벳 값 출력, 둘 이상이면 ? 출력

//        for(int i=0; i<str.length(); i++){
//            for(int j=0; j<alphabet.size(); j++){
//                if(str.charAt(i) == alphabet.){
//
//                }
//            }
//        }'
        
        // 알파벳 순서대로 배열에 저장
        char[] alphaUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//        char[] alphabetChar = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        char[] alphabetLoop = new char[26];
//        for (int i = 0; i < 26; i++) {
//            alphabetLoop[i] = (char) (65 + i);
//        }

//        System.out.println(Arrays.toString(alphabetChar));  ////배열의 출력
        int[] count = new int[26];

        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<alphaUpper.length; j++){
                if(str.charAt(i) == alphaUpper[j]){
                    count[j] += 1;
                }
            }
        }
        boolean isOnly = true;

        System.out.println(Arrays.toString(count));
        char result = alphaUpper[0];
        int max = count[0];
        for(int i = 1; i<count.length; i++){
            if(count[i] == max){
                isOnly = false;
            }
            if(count[i] > max){
                isOnly = true;
                max = count[i];
                result = alphaUpper[i];
            }
        }

        if(isOnly){
            System.out.println(result);

        }else{
            System.out.println("?");
        }


    }
}
