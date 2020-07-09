package com.github.muirandy.evil;

import java.time.LocalDate;

public class Turtle {
    public int noAssertions(int input) {
        return input + 1;
    }

    public boolean conditionalsBoundary(int i) {
        if (i < 2)
            return true;
        return false;
    }

    public int increments(int i) {
        i++;
        return i;
    }

    public int negativeInverter(int i) {
        return -i;
    }

    public int math(int x, int y) {
        return x + y;
    }

    public boolean callFirstMethod() {
        secondMethod();
        return true;
    }

    private void secondMethod() {
        System.out.println("Hello World");
    }

    public boolean isToday(LocalDate date) {
        return LocalDate.now().compareTo(date) == 0;
    }
}
