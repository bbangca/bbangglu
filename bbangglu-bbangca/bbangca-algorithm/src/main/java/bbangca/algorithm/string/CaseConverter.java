package bbangca.algorithm.string;

import java.util.Scanner;

public class CaseConverter {

    public static void main(String[] args) {
        CaseConverter caseConverter = new CaseConverter();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(caseConverter.solution(str));
    }

    public String solution(String str) {
        StringBuilder builder = new StringBuilder();

        for (char c : str.toCharArray()) {

            builder.append(swapCase(c));
        }

        return builder.toString();
    }

    private char swapCase(char c) {
        //  대문자 판별
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }

        return (char) (c - 32);
    }

    private boolean isUpperCase(char ch) {
        return true;
    }
}
