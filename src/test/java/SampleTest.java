package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void op() {
    }

    @org.junit.jupiter.api.Test
    void fact() {
            Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> sample.fact(-1))
                .withMessage("N should be positive"); // (3)
        }

    @Test
    void fact_of_3_is_6() {
        int result = sample.fact(3);
        Assertions.assertThat(result).isEqualTo(6); // (4)
    }
}
