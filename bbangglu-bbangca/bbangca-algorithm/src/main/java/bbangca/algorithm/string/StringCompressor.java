package bbangca.algorithm.string;

import java.util.Scanner;

public class StringCompressor {
    public static void main(String[] args) {
        StringCompressor sc = new StringCompressor();

        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(sc.solution(str));
    }

    public String solution(String str) {

        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        char ch = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            if (ch == str.charAt(i)) {
                cnt++;
            } else if (ch != str.charAt(i)) {
                sb.append(ch);

                if (cnt > 1) {
                    sb.append(cnt);
                }
                ch = str.charAt(i);
                cnt = 1;
            }

            if (i == str.length() - 1) {
                sb.append(ch);
                if (cnt > 1) {
                    sb.append(cnt);
                }
            }

        }

        return sb.toString();
    }

    public String solutionUsingEmpty(String str) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        // 공백 추가
        str = str.concat(" ");


        for (int i = 0; i < str.length() - 1; i++) {


            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else if (str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                }

                cnt = 1;

            }
        }

        return sb.toString();

    }
}
