package com.github.muirandy.evil;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TurtleTest {
    private Turtle turtle = new Turtle();

    @Test
    public void noAssertionTest() {
        turtle.noAssertions(1);
    }

    @Test
    public void conditionalsBoundary() {
        assertTrue(turtle.conditionalsBoundary(1));
        assertFalse(turtle.conditionalsBoundary(3));
    }

    @Test
    public void increments() {
        assertTrue(5 > turtle.increments(3));
    }

    @Test
    public void negativeInverter() {
        int actual = turtle.negativeInverter(0);
        assertEquals(actual * -1, actual);
    }

    @Test
    public void math() {
        assertEquals(4, turtle.math(4, 0));
    }

    @Test
    public void voidMethodRemoval() {
        turtle.callFirstMethod();
    }

    @Test
    public void isToday() {
        LocalDate today = LocalDate.now();
        assertTrue(turtle.isToday(today));
    }
}
