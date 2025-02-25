package bbangca.algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestCharDistance {

    public static void main(String[] arg) {
        ShortestCharDistance scd = new ShortestCharDistance();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);


        System.out.println(scd.solution(str, ch));


    }

    // O(N*M) 시간 복잡도로 비효율적 -> 이중 루프 -> 투 포인터 방법 개선
    public String solution(String str, char ch) {
        ArrayList<Integer> specCharIdx = getSpecCharIdx(str, ch);
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {

            for (int idx : specCharIdx) {

                if (min > Math.abs(i - idx)) {
                    min = Math.abs(i - idx);
                }
            }

            list.add(String.valueOf(min));
            min = Integer.MAX_VALUE;
        }

        return String.join(" ", list);
    }


    public String solutionUsingTwoPointer(String str, char ch) {
        int[] distance = new int[str.length()];
        int p = str.length();

        // 왼쪽에서 오른쪽으로 거리 계산
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                p = 0;
                distance[i] = 0;
            } else {
                p++;
                distance[i] = p;
            }
        }

        p = str.length();

        // 오른쪽에서 왼쪽으로 거리 계산
        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == ch) {
                p = 0;
            } else {
                p++;
                distance[i] = Math.min(distance[i], p);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i : distance) {
            sb.append(i).append(" ");
        }

        return sb.toString().strip();
    }


    private ArrayList<Integer> getSpecCharIdx(String str, char ch) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                array.add(i);
            }
        }

        return array;
    }
}
