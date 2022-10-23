import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursioTest {


    @Test
    void factorial() {
        Recursio recursio = new Recursio();

        int result = recursio.factorial(5);

        assertThat(result).isEqualTo(120);
    }

    @Test
    void sum() {
        Recursio recursio = new Recursio();

        int result = recursio.sum(new int[]{1, 2, 10});

        assertThat(result).isEqualTo(13);
    }

    @Test
    void max() {
        Recursio recursio = new Recursio();

        int result = recursio.max(new int[]{1, 2, 10, 4, 4, 50, 8, 7, 3});

        assertThat(result).isEqualTo(50);
    }

    @Test
    void col() {
        Recursio recursio = new Recursio();

        int result = recursio.col(new int[]{1, 2, 10, 4, 4, 50, 8, 4, 7, 3, 4}, 4);

        assertThat(result).isEqualTo(4);
    }
}