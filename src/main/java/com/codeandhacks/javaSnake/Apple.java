package com.codeandhacks.javaSnake;

import javax.swing.*;
import java.util.Random;

public class Apple {
    private static int randomPosition[] = {0,0};
    private static JPanel pGame;

    public Apple() {

    }

    public static int[] getRandomPosition(JPanel panelGame) {
        //When the snake eats the apple, it generates a new randomPosition
        //It needs the position of the Snake (TO FIX)
        pGame = panelGame;
        Random r = new Random();
        int lowW = 10;
        int highW = pGame.getWidth();


        int lowH = 10;
        int highH = pGame.getHeight();


        int randomX = r.nextInt(highW-lowW) + lowW;
        int randomY = r.nextInt(highH-lowH) + lowH;


        randomPosition[0] = randomX - 10;
        randomPosition[1] = randomY - 10;

        return randomPosition;
    }
}
