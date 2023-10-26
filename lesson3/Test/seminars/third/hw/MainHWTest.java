package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 8, 16, 26})
    public void numberIsOdd(int n) {
        assertTrue(MainHW.isOdd(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 17, 27})
    public void numberNotIsOdd(int n) {
        assertFalse(MainHW.isOdd(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {30, 40, 55, 98})
    public void numberInInterval(int n) {
        assertTrue(MainHW.numInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 25, 100, 150})
    public void numberNotInInterval(int n) {
        assertFalse(MainHW.numInInterval(n));
    }
}
