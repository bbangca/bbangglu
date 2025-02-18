package bbangca.algorithm.string;

import java.util.Scanner;

class CharacterFinder {

    public static void main(String[] args) {
        CharacterFinder cf = new CharacterFinder();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // 다음 token의  첫번째 문자 변환
        char ch = sc.next().charAt(0);

        System.out.println(cf.solution(str, ch));
    }

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char ch : str.toCharArray()) {
            if (ch == c) {
                answer++;
            }

        }
        return answer;
    }
}
