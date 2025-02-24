package bbangca.algorithm.string;

import java.util.Scanner;

public class NumberExtractor {
    public static void main(String[] args) {
        NumberExtractor ne = new NumberExtractor();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(ne.solution(str));
    }

    public int solution(String str) {
        str = str.replaceAll("[^0-9]", "");

        return Integer.parseInt(str);
    }

    public int solutionUsingIsDigit(String str) {
        StringBuilder answer = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)) {
                answer.append(ch);
            }
        }

        return Integer.parseInt(answer.toString());
    }

    public int solutionUsingCharArray(String str) {
        int answer = 0;
        
        // 문자의 아스키코드값 찾을때
        // System.out.println("0".codePointAt(0));
        // System.out.println("9".codePointAt(0));

        for (char ch : str.toCharArray()) {
            if (ch >= 48 && ch <= 57) {
                answer = answer * 10 + (ch - 48);
            }
        }
        return answer;
    }
}