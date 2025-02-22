package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordReverserTest {
    private final WordReverser wr = new WordReverser();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("단어의 갯수와 단어가 주어진다면")
        class Context_with_word_count_and_word {

            @Test
            @DisplayName("단어를 뒤집어서 반환 한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(wr.solution(new String[]{"good", "Time", "Big"})).isEqualTo(List.of("doog", "emiT", "giB"));
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingToCharArray 메소드")
    class Describe_solutionUsingToCharArray {

        @Nested
        @DisplayName("단어의 갯수와 단어가 주어진다면")
        class Context_with_word_count_and_word {

            @Test
            @DisplayName("단어를 뒤집어서 반환 한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(wr.solutionUsingToCharArray(new String[]{"good", "Time", "Big"})).isEqualTo(List.of("doog", "emiT", "giB"));
            }
        }
    }

}