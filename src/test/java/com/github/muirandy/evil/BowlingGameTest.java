package com.github.muirandy.evil;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void gutterGame() {
        roll(0, 20);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void allOnes() {
        roll(1, 20);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void oneSpare() {
        rollSpare();
        roll(3, 1);
        roll(17, 0);
        assertEquals(16, bowlingGame.score());
    }

    @Test
    public void oneStrike() {
        rollStrike();
        roll(4, 1);
        roll(3, 1);
        roll(0, 16);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void perfectGame() {
        for (int i = 0; i < 12; i++)
            rollStrike();
        assertEquals(300, bowlingGame.score());
    }

    private void rollStrike() {
        roll(10, 1);
    }

    private void rollSpare() {
        roll(6, 1);
        roll(4, 1);
    }

    private void roll(int score, int count) {
        for (int i = 0; i<count; i++)
            bowlingGame.roll(score);
    }
}
