package com.hongchuan1992.Dice;

/**
 * Created by Zhang Hongchuan on 2016/1/21.
 */
public class DiceRoller {
    public static int rollDice(){
        return (int) ((Math.random()*6) + 1) ;
    }
}
