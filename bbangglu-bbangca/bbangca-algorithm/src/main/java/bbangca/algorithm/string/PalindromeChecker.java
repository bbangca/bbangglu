package bbangca.algorithm.string;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(pc.solution(str));
    }

    public String solution(String str) {
        str = str.toUpperCase();

        return str.contentEquals(new StringBuilder(str).reverse()) ? "YES" : "NO";
    }

    public String solutionUsingCharAt(String str) {
        // 문자열의 반절을 비교한다
        int len = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }

    public String solutionUsingIgnoreCase(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();

        if (reversedStr.equalsIgnoreCase(str)) {
            return "YES";
        }

        return "NO";
    }
}
