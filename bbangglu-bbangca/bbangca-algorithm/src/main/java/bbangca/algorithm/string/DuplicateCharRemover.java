package bbangca.algorithm.string;

import java.util.Scanner;

public class DuplicateCharRemover {
    public static void main(String[] args) {
        DuplicateCharRemover dcr = new DuplicateCharRemover();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(dcr.solution(str));
    }

    public String solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : chars) {
            if (!sb.toString().contains(String.valueOf(ch))) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public String solutionUsingIndexOf(String str) {
        String answer = "";
        // indexOf 찾으려는 문자의 처음 위치를 반환 한다.
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

}
