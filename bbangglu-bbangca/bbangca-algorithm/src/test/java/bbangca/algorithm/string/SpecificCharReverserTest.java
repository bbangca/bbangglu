package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SpecificCharReverserTest {

    private final SpecificCharReverser scr = new SpecificCharReverser();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(scr.solution("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
                Assertions.assertThat(scr.solution("kdj#@kdjg%$#kdjgk@kd$dk")).isEqualTo("kdd#@kkgj%$#dkgjd@kj$dk");
                Assertions.assertThat(scr.solution("kqQdj#@kd#g%$#kdj&&gk@kd$dQGk")).isEqualTo("kGQdd#@kk#g%$#jdk&&gd@kj$dQqk");
                Assertions.assertThat(scr.solution("kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk")).isEqualTo("kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk");
                Assertions.assertThat(scr.solution("kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#")).isEqualTo("kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingStringReverse 메소드")
    class Describe_solutionUsingStringReverse {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(scr.solutionUsingStringReverse("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
                Assertions.assertThat(scr.solutionUsingStringReverse("kdj#@kdjg%$#kdjgk@kd$dk")).isEqualTo("kdd#@kkgj%$#dkgjd@kj$dk");
                Assertions.assertThat(scr.solutionUsingStringReverse("kqQdj#@kd#g%$#kdj&&gk@kd$dQGk")).isEqualTo("kGQdd#@kk#g%$#jdk&&gd@kj$dQqk");
                Assertions.assertThat(scr.solutionUsingStringReverse("kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk")).isEqualTo("kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk");
                Assertions.assertThat(scr.solutionUsingStringReverse("kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#")).isEqualTo("kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#");
            }
        }
    }

    @Nested
    @DisplayName("solutionUsingAlphabetic 메소드")
    class Describe_solutionUsingAlphabetic {

        @Nested
        @DisplayName("문자열이 주어진다면")
        class Context_with_string {

            @Test
            @DisplayName("문장의 알파벳만 뒤집어서 반환한다")
            void it_returns_the_reversed_word() {
                Assertions.assertThat(scr.solutionUsingAlphabetic("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
                Assertions.assertThat(scr.solutionUsingAlphabetic("kdj#@kdjg%$#kdjgk@kd$dk")).isEqualTo("kdd#@kkgj%$#dkgjd@kj$dk");
                Assertions.assertThat(scr.solutionUsingAlphabetic("kqQdj#@kd#g%$#kdj&&gk@kd$dQGk")).isEqualTo("kGQdd#@kk#g%$#jdk&&gd@kj$dQqk");
                Assertions.assertThat(scr.solutionUsingAlphabetic("kqQ!DGSGSdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DHSQGk")).isEqualTo("kGQ!SHDSGDd#@dk#k%$#gjd&&kg@dk$j#%&dSG@!SGDQqk");
                Assertions.assertThat(scr.solutionUsingAlphabetic("kHSHHS#qQ!DGSG#@Sdj#@kd#g%$#kdj&&gk@kd$d#%&DGS@!DH%SQGk#")).isEqualTo("kGQSHD#SG!Dddk#@kgj#@dk#g%$#dkj&&dS@GS$G#%&DQq@!SH%HSHk#");
            }
        }
    }
}