package com.borikov.utils.util;

import com.borikov.utils.exception.IncorrectNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void isPositiveNumberCorrectDataShouldReturnTrue() {
        try {
            boolean actual = StringUtils.isPositiveNumber("10");
            assertTrue(actual);
        } catch (IncorrectNumberException e) {
            fail("Incorrect data");
        }
    }

    @Test
    void isPositiveNumberIncorrectDataShouldReturnFalse() {
        try {
            boolean actual = StringUtils.isPositiveNumber("-10");
            assertFalse(actual);
        } catch (IncorrectNumberException e) {
            fail("Incorrect data");
        }
    }

    @Test
    void isPositiveNumberIncorrectDataShouldGenerateException() {
        assertThrows(IncorrectNumberException.class, () -> {
            StringUtils.isPositiveNumber("qwerty");
        });
    }
}
