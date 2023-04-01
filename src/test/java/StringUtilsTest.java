import org.example.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "44", "511"})
    public void isPositiveNumberTrue(String str) {
        assertThat(StringUtils.isPositiveNumber(str)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-3", "-445"})
    public void isPositiveNumberFalse(String str) {
        assertThat(StringUtils.isPositiveNumber(str)).isFalse();
    }

}
