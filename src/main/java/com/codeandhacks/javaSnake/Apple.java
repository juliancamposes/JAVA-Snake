package com.codeandhacks.javaSnake;

import javax.swing.*;
import java.util.Random;

public class Apple {
    private int randomPosition[] = {0,0};

    public Apple() {

    }

    public int[] getRandomPosition(JPanel panelGame) {
        //When the snake eats the apple, it generates a new randomPosition
        //It needs the position of the Snake (TO FIX)

        Random r = new Random();
        int lowW = 10;
        int highW = panelGame.getWidth();


        int lowH = 10;
        int highH = panelGame.getHeight();


        int randomX = r.nextInt(highW-lowW) + lowW;
        int randomY = r.nextInt(highH-lowH) + lowH;


        randomPosition[0] = randomX - 10;
        randomPosition[1] = randomY - 10;

        return randomPosition;
    }
}
