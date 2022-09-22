package calculator;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.Test;

public class PositiveTest {
    @Test
    public void create() {
        assertThat(new Positive("1")).isEqualTo(new Positive("1"));
    }

    @Test
    public void 덧셈() {
        var positive = new Positive("1");
        assertThat(positive.plus(5)).isEqualTo(6);
    }

    @Test
    public void 덧셈2() {
        var positive1 = new Positive("2");
        var positive2 = new Positive("3");
        assertThat(positive1.plus(positive2)).isEqualTo(5);
    }

    @Test
    public void 음수() {
        assertThatThrownBy(() -> {
            new Positive("-1");
        }).isInstanceOf(RuntimeException.class);
    }
}
