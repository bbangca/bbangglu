package bbangca.algorithm.string;

import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) {
        WordFinder wf = new WordFinder();

        Scanner sc = new Scanner(System.in);

        System.out.println(wf.solution(sc.nextLine()));
    }


    public String solution(String str) {
        String word = "";
        String answer = "";

        for (char ch : str.toCharArray()) {

            if (ch == ' ') {
                word = "";
            } else {
                // String 문자열 합치기는 성능 이슈 문제가 있다.
                // 쓰레드 동시성 문제가 없다면 StringBuilder 사용
                // 쓰레드 동시성 문제가 있다면 StringBuffer 사용
                word += String.valueOf(ch);
            }

            if (answer.length() < word.length()) {
                answer = word;
            }
        }
        return answer;
    }

    public String solutionUsingSplit(String str) {
        String answer = "";
        String[] words = str.split(" ");

        for (String word : words) {
            if (answer.length() < word.length()) {
                answer = word;
            }
        }
        return answer;
    }

    public String solutionUsingIndexOfAndSubstring(String str) {
        String answer = "";
        int pos;

        // String str 에 값을 대입하여 찾는 방법에 대한 고민
        while ((pos = str.indexOf(" ")) != -1) {
            String word = str.substring(0, pos);
            if (answer.length() < word.length()) {
                answer = word;
            }
            // 문자열을 잘라서 쓰는 이유 공백(" ")을 찾을때 이미 찾은 공백을 제거해야 한다.
            // indexOf의 경우 찾으려는 문자의 처음 pos를 반환 하기 때문이다.
            str = str.substring(pos + 1);
        }

        if (answer.length() < str.length()) {
            answer = str;
        }

        return answer;
    }
}
