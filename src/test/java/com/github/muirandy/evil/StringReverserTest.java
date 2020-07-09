package com.github.muirandy.evil;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {

    private StringReverser stringReverser = new StringReverser();

    @Test
    public void single() {
        String result = stringReverser.reverse("o");

        assertEquals("o", result);
    }

    @Test
    public void twoChars() {
        String result = stringReverser.reverse("ab");

        assertEquals("ba", result);
    }
}
