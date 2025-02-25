package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class StringCompressorTest {
    private final StringCompressor sc = new StringCompressor();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문자열을 압축하여 반환한다.")
            void it_returns_compressed_string() {
                Assertions.assertThat(sc.solution("KKHSSSSSSSE")).isEqualTo("K2HS7E");
                Assertions.assertThat(sc.solution("KSTTTSEEKFKKKDJJGG")).isEqualTo("KST3SE2KFK3DJ2G2");
                Assertions.assertThat(sc.solution("KDKGKKSKKFJKKKKSLSSSSKFKSSSS")).isEqualTo("KDKGK2SK2FJK4SLS4KFKS4");
                Assertions.assertThat(sc.solution("KKKKKDDDDDKDDDKKSKKFJKKKKSLSSSSKFKSSSS")).isEqualTo("K5D5KD3K2SK2FJK4SLS4KFKS4");
                Assertions.assertThat(sc.solution("KKKKTTTUUUKDDDDDKDDDKKSKKFJKYYYKUYY")).isEqualTo("K4T3U3KD5KD3K2SK2FJKY3KUY2");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingEmpty 메소드")
    class Describe_solutionUsingEmpty {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문자열을 압축하여 반환한다.")
            void it_returns_compressed_string() {
                Assertions.assertThat(sc.solutionUsingEmpty("KKHSSSSSSSE")).isEqualTo("K2HS7E");
                Assertions.assertThat(sc.solutionUsingEmpty("KSTTTSEEKFKKKDJJGG")).isEqualTo("KST3SE2KFK3DJ2G2");
                Assertions.assertThat(sc.solutionUsingEmpty("KDKGKKSKKFJKKKKSLSSSSKFKSSSS")).isEqualTo("KDKGK2SK2FJK4SLS4KFKS4");
                Assertions.assertThat(sc.solutionUsingEmpty("KKKKKDDDDDKDDDKKSKKFJKKKKSLSSSSKFKSSSS")).isEqualTo("K5D5KD3K2SK2FJK4SLS4KFKS4");
                Assertions.assertThat(sc.solutionUsingEmpty("KKKKTTTUUUKDDDDDKDDDKKSKKFJKYYYKUYY")).isEqualTo("K4T3U3KD5KD3K2SK2FJKY3KUY2");
            }
        }
    }
}