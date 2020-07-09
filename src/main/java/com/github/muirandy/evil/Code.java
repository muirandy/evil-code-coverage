package com.github.muirandy.evil;

import org.apache.commons.lang3.StringUtils;

public class Code {
    public String reverse(String input) {
        if (input.length() < 2)
            return input;

        String result = StringUtils.reverse(input);

        return result;
    }
}
