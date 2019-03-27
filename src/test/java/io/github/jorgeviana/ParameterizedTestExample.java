package io.github.jorgeviana;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ParameterizedTestExample {

    @ParameterizedTest(name = "{index}: the max of {0} and {1} is {2}")
    @CsvSource({
//           a, b, max
            "1, 2, 2",
            "9, 3, 9",
            "1, 1, 1"
    })
    void testing_max(int a, int b, int max) {
        assertThat(Math.max(a, b)).isEqualTo(max);
    }
}
