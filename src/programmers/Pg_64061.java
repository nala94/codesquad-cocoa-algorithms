package programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Pg_64061 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

//        int answer = solution(board, moves);
//        System.out.println(answer);

    }


    // 같은 column 에서 가장 첫번째 있는 값을 옮긴다. 인형이 없으면 아무행동 x
    // 인형의 종류 1~100, 인형 없음 : 0
    // 바구니를 리스트로
    // board[][moves] 검사
    // 바구니에 마지막에 들어온 값 recentDoll , 처음 0 , 인형 두개가 사라지면 마지막 값이 된다.
    // 리스트 크기가 0 이면 값을 0으로,  else 마지막 값으로
    // tmp에 담고, 다음 값이 같으면 있던 값을 remove

//    public static int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        List<Integer> basket = new ArrayList<>();
//        for (int move : moves) {
//            for (int i = 0; i < board.length; i++) {
//
//                if (board[i][move - 1] != 0) {
//
//                    if (basket.size() == 0) {
//                        basket.add(tmp);
//
//                    } else if (basket.get(basket.size() - 1) == board[i][move - 1]) {
//                        board[i][move - 1] = 0;
//                        answer += 2;
//                        basket.remove(basket.size() - 1);
//
//                    } else {
//                        basket.add(tmp);
//
//                    }
//                    board[i][move - 1] = 0;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>();
        int scoreA = 0;
        int scoreB = 0;
        for(int i=0; i<3; i++){
            if(a.get(i) > b.get(i)){
                scoreA += 1;
            }else if(a.get(i) < b.get(i)){
                scoreB +=1;
            }
        }
        score.add(scoreA);
        score.add(scoreB);
        return score;

    }

    public static String timeConversion(String s) throws ParseException {
        SimpleDateFormat fromUser = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat myFormat = new SimpleDateFormat("HH:mm:ss");

        String str = myFormat.format(fromUser.parse(s));

        return str;
    }



//    public int solution(int[][] board, int[] moves) {
//
//        List<Integer> basket = new ArrayList<>();
//        int tmp = 0;
//        for (int move : moves) {
//            for (int i = 0; i < board.length; i++) {
//                // 1. 빈칸이 아니면 저장한다. 그리고 그 부분을 0으로 치환한다.
//                if(board[i][move - 1] != 0){
//                    tmp = board[i][move - 1];
//                    board[i][move - 1] = 0;
//                    if(tmp == basket.get(basket.size() - 1)){
//                        basket.remove(basket.size() - 1);
//                    }else{
//                        basket.add(tmp);
//                    }
//                    break;
//                }
//                // 2. 저장한 값을 리스트의 마지막 값과 비교해본다. 처음에 에러 안나나?
////                if (tmp == board[i][move - 1]) {
////                    basket.remove(basket.size() - 1);
////                    break;
////                }
////                if (board[i][move - 1] != 0) {
////                    if(tmp == board[i][move - 1]){
////
////                    }
////                    tmp = board[i][move - 1];
////                    basket.add(tmp);
////                    break;
////                }
//
//            }
//        }
//        return basket.size();
//    }
}