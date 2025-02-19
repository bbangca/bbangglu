package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class WordFinderTest {
    private final WordFinder wordFinder = new WordFinder();

    @Nested
    @DisplayName("solution 메서드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("가장 긴 단어를 반환 한다.")
            void it_returns_longest_word() {
                Assertions.assertThat(wordFinder.solution("it is time to study")).isEqualTo("study");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingSplit 메서드")
    class Describe_solutionUsingSplit {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("가장 긴 단어를 반환 한다.")
            void it_returns_longest_word() {
                Assertions.assertThat(wordFinder.solutionUsingSplit("it is time to study")).isEqualTo("study");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingIndexOfAndSubstring 메서드")
    class Describe_solutionUsingIndexOfAndSubstring {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("가장 긴 단어를 반환 한다.")
            void it_returns_longest_word() {
                Assertions.assertThat(wordFinder.solutionUsingIndexOfAndSubstring("it is time to study")).isEqualTo("study");
            }
        }
    }
}