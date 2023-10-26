package seminars.third.coverage;

import seminars.third.coverage.SomeService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private SomeService serv;

    @BeforeEach
    public void init() {
        serv = new SomeService();
    }
   // 3.1.
    @ParameterizedTest
    @ValueSource(ints = {5, 20, 55})
    void multipleFiveNotThreeReturnsBuzz(int n) {
        assertThat(serv.fizzBuzz(n)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 18})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertThat(serv.fizzBuzz(n)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void multipleThreeAndFiveReturnsFizzBuzz(int n) {
        assertThat(serv.fizzBuzz(n)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 7, 22})
    void multipleNotThreeAndFiveReturnsNum(int n) {
        assertThat(serv.fizzBuzz(n)).isEqualTo(String.valueOf(n));
    }

    @Test
    void arrayStartsWithSix() {
        assertTrue(serv.firstLast6(new int[] {6, 2, 3, 4, 5, 7, 8}));
    }

    @Test
    void arrayEndsWithSix() {
        assertTrue(serv.firstLast6(new int[] {2, 3, 4, 5, 7, 8, 6}));
    }

    @Test
    void arrayNotStartsAndEndsWithSix() {
        assertFalse(serv.firstLast6(new int[] {2, 3, 4, 5, 7, 8}));
    }
}