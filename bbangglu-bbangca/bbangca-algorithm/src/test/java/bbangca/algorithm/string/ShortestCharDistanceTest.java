package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ShortestCharDistanceTest {
    private final ShortestCharDistance scd = new ShortestCharDistance();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("숫자만 추출 후 자연수를 반환한다.")
            void it_returns_a_natural_number_after_extracting_digits() {
                Assertions.assertThat(scd.solution("teachermode", 'e')).isEqualTo("1 0 1 2 1 0 1 2 2 1 0");
                Assertions.assertThat(scd.solution("fkdgkjdflkgjljslgjkfldjlkfdg", 'f')).isEqualTo("0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2");
                Assertions.assertThat(scd.solution("kkkkkkkk", 'k')).isEqualTo("0 0 0 0 0 0 0 0");
                Assertions.assertThat(scd.solution("eochjgoekghlakegh", 'h')).isEqualTo("3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0");
                Assertions.assertThat(scd.solution("timeout", 't')).isEqualTo("0 1 2 3 2 1 0");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingTwoPointer 메소드")
    class Describe_solutionUsingTwoPointer {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("숫자만 추출 후 자연수를 반환한다.")
            void it_returns_a_natural_number_after_extracting_digits() {
                Assertions.assertThat(scd.solutionUsingTwoPointer("teachermode", 'e')).isEqualTo("1 0 1 2 1 0 1 2 2 1 0");
                Assertions.assertThat(scd.solutionUsingTwoPointer("fkdgkjdflkgjljslgjkfldjlkfdg", 'f')).isEqualTo("0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2");
                Assertions.assertThat(scd.solutionUsingTwoPointer("kkkkkkkk", 'k')).isEqualTo("0 0 0 0 0 0 0 0");
                Assertions.assertThat(scd.solutionUsingTwoPointer("eochjgoekghlakegh", 'h')).isEqualTo("3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0");
                Assertions.assertThat(scd.solutionUsingTwoPointer("timeout", 't')).isEqualTo("0 1 2 3 2 1 0");
            }
        }
    }

}