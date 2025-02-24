package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DuplicateCharRemoverTest {
    private final DuplicateCharRemover dcr = new DuplicateCharRemover();

    @Nested
    @DisplayName("solution 메서드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("중복된 문자가 제거된 문자열을 반환한다.")
            void it_returns_longest_word() {
                Assertions.assertThat(dcr.solution("ksekkset")).isEqualTo("kset");
                Assertions.assertThat(dcr.solution("kjkgjlskjekieogiwo")).isEqualTo("kjglseiow");
                Assertions.assertThat(dcr.solution("kdkgksjgkjlsjgkjsljgkjaksjg")).isEqualTo("kdgsjla");
                Assertions.assertThat(dcr.solution("eiotuoiwtitoiywiotieoiutoiwioweuotiuwoieut")).isEqualTo("eiotuwy");
                Assertions.assertThat(dcr.solution("qiutoiwuotiqpituoiwuiotuowutowiutoityioqp")).isEqualTo("qiutowpy");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingIndexOf 메서드")
    class Describe_solutionUsingIndexOfn {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("중복된 문자가 제거된 문자열을 반환한다.")
            void it_returns_longest_word() {
                Assertions.assertThat(dcr.solutionUsingIndexOf("ksekkset")).isEqualTo("kset");
                Assertions.assertThat(dcr.solutionUsingIndexOf("kjkgjlskjekieogiwo")).isEqualTo("kjglseiow");
                Assertions.assertThat(dcr.solutionUsingIndexOf("kdkgksjgkjlsjgkjsljgkjaksjg")).isEqualTo("kdgsjla");
                Assertions.assertThat(dcr.solutionUsingIndexOf("eiotuoiwtitoiywiotieoiutoiwioweuotiuwoieut")).isEqualTo("eiotuwy");
                Assertions.assertThat(dcr.solutionUsingIndexOf("qiutoiwuotiqpituoiwuiotuowutowiutoityioqp")).isEqualTo("qiutowpy");
            }
        }
    }
}