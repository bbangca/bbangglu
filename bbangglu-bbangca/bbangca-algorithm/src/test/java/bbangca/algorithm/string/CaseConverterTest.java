package bbangca.algorithm.string;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CaseConverterTest {
    private final CaseConverter converter = new CaseConverter();

    @Nested
    @DisplayName("solution 메서드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("대문자는 소문자로 소문자는 대문자로 변환하여 반환한다.")
            void it_returns_the_string_with_swapped_case() {
                Assertions.assertThat(converter.solution("StuDY")).isEqualTo("sTUdy");
            }

        }
    }

    @Nested
    @DisplayName("solutionUsingASCII 메서드")
    class Describe_solutionUsingASCII {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("대문자는 소문자로 소문자는 대문자로 변환하여 반환한다.")
            void it_returns_the_string_with_swapped_case() {
                Assertions.assertThat(converter.solutionUsingASCII("StuDY")).isEqualTo("sTUdy");
            }

        }
    }
}