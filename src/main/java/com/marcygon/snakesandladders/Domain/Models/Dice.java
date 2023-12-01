package com.marcygon.snakesandladders.Domain.Models;

import java.util.Random;

public class Dice {
    public static final int MIN_DICE_VALUE = 1;
    public static final int MAX_DICE_VALUE = 6;

    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(MAX_DICE_VALUE - MIN_DICE_VALUE + 1) + MAX_DICE_VALUE;
    }
}
