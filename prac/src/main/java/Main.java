import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        // problem7
        int[] abs = {4,7,12};
        boolean[] signs = {true,false,true};
        Solution7 sol = new Solution7();
        System.out.println(sol.solution(abs, signs));


       // problem9
//        String a = "0104444444";
//        Solution9 sol = new Solution9();
//
//        System.out.println(sol.solution(a));
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
        for (int i = 0; i < Math.abs(b-a)+1; i++) {
            if(a <= b){
                answer = answer + a + i;
            } else {
                answer = answer + b + i;
            }
        }
        return answer;
    }
}


class Solution5 {
    public int solution(String s) {
        int answer = 0;
        return Integer.parseInt(s);
    }
}


class Solution6 {
    public int solution(int[] numbers) {
        int total = 45;
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return total - answer;
    }
}

class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        for (int i = 0; i < len; i++) {
            if(signs[i]){
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

class Solution8 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer / arr.length;
    }
}

class Solution9 {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
                answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}