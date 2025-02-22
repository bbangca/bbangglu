package bbangca.algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverser {

    static public void main(String[] args) {
        WordReverser wr = new WordReverser();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        ArrayList<String> answer = wr.solution(words);

        for (String reversedWord : answer) {
            System.out.println(reversedWord);
        }

    }

    public ArrayList<String> solution(String[] words) {
        // Todo 해당 <> 표시에 대한 이해도 높이기
        ArrayList<String> answer = new ArrayList<>();

        for (String word : words) {
            // String 객체는 불변 객체로 메서드 사용시 새로운 String 객체가 생성 된다.
            // StringBuilder 객체는 생성된 객체를 이용한다.
            StringBuilder sb = new StringBuilder(word);
            answer.add(sb.reverse().toString());
        }

        return answer;
    }

    public ArrayList<String> solutionUsingToCharArray(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            int li = 0;
            int ri = word.length() - 1;

            while (li < ri) {
                char ch = chars[li];
                chars[li] = chars[ri];
                chars[ri] = ch;

                li++;
                ri--;
            }
            answer.add(String.valueOf(chars));
        }

        return answer;
    }
}
