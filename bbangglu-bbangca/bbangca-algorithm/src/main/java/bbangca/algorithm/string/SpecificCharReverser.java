package bbangca.algorithm.string;

import java.util.Scanner;

// 해당 문제는 좌우 인텍스를 조건에 맞게 이동 후 비지니스 로직을 실행하는 문제
public class SpecificCharReverser {

    public static void main(String[] args) {
        SpecificCharReverser scr = new SpecificCharReverser();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(scr.solution(str));
    }


    public String solution(String str) {

        char[] chars = str.toCharArray();

        int li = 0;
        int ri = str.length() - 1;

        while (li < ri) {
            // 대상 문자열이 알파벳이면 변경할 알파벳을 찾아서 변경
            if (isAlphabet(chars[li])) {
                while (ri > 0) {
                    if (isAlphabet(chars[ri])) {
                        char ch = chars[li];
                        chars[li] = chars[ri];
                        chars[ri] = ch;
                        ri--;
                        break;
                    }
                    ri--;
                }
            }
            li++;
        }

        return String.valueOf(chars);
    }

    public String solutionUsingStringReverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (isAlphabet(chars[i])) {
                sb.append(chars[i]);
                chars[i] = ' ';
            }
        }

        for (char ch : sb.reverse().toString().toCharArray()) {
            for (int i = 0; i < str.length(); i++) {
                if (chars[i] == ' ') {
                    chars[i] = ch;
                    break;
                }
            }
        }
        return String.valueOf(chars);
    }

    public String solutionUsingAlphabetic(String str) {
        char[] chars = str.toCharArray();
        int li = 0;
        int ri = str.length() - 1;

        while (li < ri) {
            // 특수 문자일 경우 인텍스 이동해서 왼쪽 / 오른쪽 인덱스 위치가 알파벳으로 맞추기
            if (!Character.isAlphabetic(chars[li])) {
                li++;
            } else if (!Character.isAlphabetic(chars[ri])) {
                ri--;
            } else {
                char ch = chars[li];
                chars[li] = chars[ri];
                chars[ri] = ch;
                li++;
                ri--;
            }
        }

        return String.valueOf(chars);
    }


    private boolean isAlphabet(char ch) {
        // 대소문자 소문자 체크
        return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z');
    }
}
