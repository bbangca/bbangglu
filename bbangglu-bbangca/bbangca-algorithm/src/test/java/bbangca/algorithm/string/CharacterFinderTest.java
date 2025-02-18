package bbangca.algorithm.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("CharacterFinder 클래스")
class CharacterFinderTest {
    private final CharacterFinder finder = new CharacterFinder();

    @Nested
    @DisplayName("solution 메소드")
    class Describe_solution {

        @Nested
        @DisplayName("문자열과 문자가 주어진다면")
        class Context_with_string_and_character {

            @Test
            @DisplayName("문자의 개수를 반환한다.")
            void it_returns_the_count_of_character() {
                Assertions.assertThat(finder.solution("Test", 't')).isEqualTo(2);
                Assertions.assertThat(finder.solution("Test", 'e')).isEqualTo(1);
                Assertions.assertThat(finder.solution("Test", 's')).isEqualTo(1);
                Assertions.assertThat(finder.solution("Test", 't')).isEqualTo(2);
            }
        }
    }
    
}
