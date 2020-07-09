package com.github.muirandy.evil;

public class BowlingGame {


    private static final int NUMBER_OF_FRAMES_IN_GAME = 10;
    private static final int NUMBER_OF_PINS = 10;

    private int score;
    private int[] rolls = new int[21];
    private int ballIndex = 0;

    public void roll(int score) {
        rolls[ballIndex++] = score;
    }

    public int score() {
        ballIndex = 0;

        for (int i = 0; i < NUMBER_OF_FRAMES_IN_GAME; i++)
            calculateScoreForFrame();

        return score;
    }

    private void calculateScoreForFrame() {
        if (isStrike(ballIndex)) {
            score += NUMBER_OF_PINS + rolls[ballIndex + 1] + rolls[ballIndex + 2];
            ballIndex += 1;
        } else if (isSpare(ballIndex)) {
            score += NUMBER_OF_PINS + rolls[ballIndex + 2];
            ballIndex += 2;
        } else {
            score += rolls[ballIndex] + rolls[ballIndex + 1];
            ballIndex += 2;
        }
    }

    private boolean isStrike(int ballIndex) {
        if (rolls[ballIndex] == NUMBER_OF_PINS)
            return true;
        return false;
    }

    private boolean isSpare(int ballIndex) {
        if (rolls[ballIndex] + rolls[ballIndex + 1] == 10)
            return true;
        return false;
    }
}
