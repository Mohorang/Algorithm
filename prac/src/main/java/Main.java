import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

// (100~91점 : A등급 , 90점~81점 : B등급 , 80점~71점 : C등급 , 그 외의 점수 : F등급)

public class Main {

    public static void main(String[] args) {
        //problem 1
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int column = sc.nextInt();
//
//        for (int i = 0; i < column; i++){
//            for (int j = 0; j < row; j++) {
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }
        // problem 3
//        String s = "q";
//        Solution3 sol = new Solution3();
//        System.out.println(sol.solution(s));
    }
}


class Solution2 {
    public String solution(int num) {
//        String answer = "";
//        if(num % 2 == 0){
//            answer = "Even";
//        }else {
//            answer = "Odd";
//        }
        return (num % 2 == 0) ? "Odd": "Even";
    }
}

class Solution3 {
    public String solution(String s) {
        String answer = "";
        int idx = s.length() / 2;

        answer = s.length() % 2 == 0 ? s.substring(idx-1, idx+1) : s.substring(idx, idx+1);

        return answer;
    }
}

class Solution4{
    public long solution(int a, int b) {
        long answer = 0;
        return answer;
    }
}