package com.github.muirandy.evil;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest {

    private Code code = new Code();

    @Test
    public void single() {

        String result = code.reverse("o");

        assertEquals("o", result);
    }

    @Test
    public void twoChars() {
        String result = code.reverse("ab");

        assertEquals("ba", result);
    }
}
