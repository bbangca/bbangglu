package bbangca.algorithm.string;

import java.util.Scanner;

public class ValidPalindromeChecker {
    public static void main(String[] args) {
        ValidPalindromeChecker vpc = new ValidPalindromeChecker();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(vpc.solution(str));

    }

    public String solution(String str) {
        // 알파벳을 제외한 나머지 문자열 제거
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        String alphabet = sb.toString();
        String reversed = sb.reverse().toString();

        return alphabet.equalsIgnoreCase(reversed) ? "YES" : "NO";
    }

    public String solutionUsingReplaceAll(String str) {

        String alphabet = str.replaceAll("[^a-zA-Z]", "");
        String reversed = new StringBuilder(alphabet).reverse().toString();

        return alphabet.equalsIgnoreCase(reversed) ? "YES" : "NO";
    }
}
