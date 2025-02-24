package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NumberExtractorTest {
    private final NumberExtractor ne = new NumberExtractor();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("숫자만 추출 후 자연수를 반환한다.")
            void it_returns_a_natural_number_after_extracting_digits() {
                Assertions.assertThat(ne.solution("g0en2T0s8eSoft")).isEqualTo(208);
                Assertions.assertThat(ne.solution("dkf0jkk0dkjkgjljl1kgh0ekjlkjf2lkjsklfjlkdj")).isEqualTo(102);
                Assertions.assertThat(ne.solution("Akdj0Gk1djADG2SDGkdjf")).isEqualTo(12);
                Assertions.assertThat(ne.solution("Akdj0Gk1djADG2SDGkdj0f")).isEqualTo(120);
                Assertions.assertThat(ne.solution("Akdj0Gk1dgdgdAGSGAG3DGGA45GAGADGDGdjADG2SDGkdj0f")).isEqualTo(134520);
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingIsDigit 메소드")
    class Describe_solutionUsingIsDigit {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("숫자만 추출 후 자연수를 반환한다.")
            void it_returns_a_natural_number_after_extracting_digits() {
                Assertions.assertThat(ne.solutionUsingIsDigit("g0en2T0s8eSoft")).isEqualTo(208);
                Assertions.assertThat(ne.solutionUsingIsDigit("dkf0jkk0dkjkgjljl1kgh0ekjlkjf2lkjsklfjlkdj")).isEqualTo(102);
                Assertions.assertThat(ne.solutionUsingIsDigit("Akdj0Gk1djADG2SDGkdjf")).isEqualTo(12);
                Assertions.assertThat(ne.solutionUsingIsDigit("Akdj0Gk1djADG2SDGkdj0f")).isEqualTo(120);
                Assertions.assertThat(ne.solutionUsingIsDigit("Akdj0Gk1dgdgdAGSGAG3DGGA45GAGADGDGdjADG2SDGkdj0f")).isEqualTo(134520);
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingCharArray 메소드")
    class Describe_solutionUsingCharArray {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("숫자만 추출 후 자연수를 반환한다.")
            void it_returns_a_natural_number_after_extracting_digits() {
                Assertions.assertThat(ne.solutionUsingCharArray("g0en2T0s8eSoft")).isEqualTo(208);
                Assertions.assertThat(ne.solutionUsingCharArray("dkf0jkk0dkjkgjljl1kgh0ekjlkjf2lkjsklfjlkdj")).isEqualTo(102);
                Assertions.assertThat(ne.solutionUsingCharArray("Akdj0Gk1djADG2SDGkdjf")).isEqualTo(12);
                Assertions.assertThat(ne.solutionUsingCharArray("Akdj0Gk1djADG2SDGkdj0f")).isEqualTo(120);
                Assertions.assertThat(ne.solutionUsingCharArray("Akdj0Gk1dgdgdAGSGAG3DGGA45GAGADGDGdjADG2SDGkdj0f")).isEqualTo(134520);
            }
        }


    }
}