package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ValidPalindromeCheckerTest {
    private final ValidPalindromeChecker vpc = new ValidPalindromeChecker();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(vpc.solution("found7, time: study; Yduts; emit, 7Dnuof")).isEqualTo("YES");
                Assertions.assertThat(vpc.solution("found7, timk: study; Yduts; emit, 7Dnuof")).isEqualTo("NO");
                Assertions.assertThat(vpc.solution("Tae,aba;e#%a*T")).isEqualTo("YES");
                Assertions.assertThat(vpc.solution("kdjg$@kjkldjkg%@dkjgkj")).isEqualTo("NO");
                Assertions.assertThat(vpc.solution("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a")).isEqualTo("YES");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingReplaceAll 메소드")
    class Describe_solutionUsingReplaceAll {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(vpc.solutionUsingReplaceAll("found7, time: study; Yduts; emit, 7Dnuof")).isEqualTo("YES");
                Assertions.assertThat(vpc.solutionUsingReplaceAll("found7, timk: study; Yduts; emit, 7Dnuof")).isEqualTo("NO");
                Assertions.assertThat(vpc.solutionUsingReplaceAll("Tae,aba;e#%a*T")).isEqualTo("YES");
                Assertions.assertThat(vpc.solutionUsingReplaceAll("kdjg$@kjkldjkg%@dkjgkj")).isEqualTo("NO");
                Assertions.assertThat(vpc.solutionUsingReplaceAll("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a")).isEqualTo("YES");
            }
        }
    }
}