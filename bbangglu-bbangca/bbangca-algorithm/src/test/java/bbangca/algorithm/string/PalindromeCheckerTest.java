package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {
    private final PalindromeChecker pc = new PalindromeChecker();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(pc.solution("gooG")).isEqualTo("YES");
                Assertions.assertThat(pc.solution("tttttttttttttt")).isEqualTo("YES");
                Assertions.assertThat(pc.solution("sssssssssssssssksssssssssssssss")).isEqualTo("YES");
                Assertions.assertThat(pc.solution("kstudkgksjlkgjlksjdggkkllllllllllllllllllllllsjgksjldgjlllllllllllllllgjks")).isEqualTo("NO");
                Assertions.assertThat(pc.solution("skSKskuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuKSksks")).isEqualTo("YES");
            }

        }

    }

    @Nested
    @DisplayName("solutionUsingCharAt 메소드")
    class Describe_solutionUsingCharAt {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(pc.solutionUsingCharAt("gooG")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingCharAt("tttttttttttttt")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingCharAt("sssssssssssssssksssssssssssssss")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingCharAt("kstudkgksjlkgjlksjdggkkllllllllllllllllllllllsjgksjldgjlllllllllllllllgjks")).isEqualTo("NO");
                Assertions.assertThat(pc.solutionUsingCharAt("skSKskuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuKSksks")).isEqualTo("YES");
            }

        }

    }

    @Nested
    @DisplayName("solutionUsingIgnoreCase 메소드")
    class Describe_solutionUsingIgnoreCase {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(pc.solutionUsingIgnoreCase("gooG")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingIgnoreCase("tttttttttttttt")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingIgnoreCase("sssssssssssssssksssssssssssssss")).isEqualTo("YES");
                Assertions.assertThat(pc.solutionUsingIgnoreCase("kstudkgksjlkgjlksjdggkkllllllllllllllllllllllsjgksjldgjlllllllllllllllgjks")).isEqualTo("NO");
                Assertions.assertThat(pc.solutionUsingIgnoreCase("skSKskuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuKSksks")).isEqualTo("YES");
            }

        }

    }
}