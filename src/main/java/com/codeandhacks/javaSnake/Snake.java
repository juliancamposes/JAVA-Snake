package com.codeandhacks.javaSnake;

import javax.swing.*;


public class Snake {
    private Window w;
    private JPanel pGame;
    JLabel headRight = new JLabel();
    private String direction = "Right";
    public Snake(Window w, JPanel pGame) {
        this.pGame = pGame;
        this.w = w;
        setHead();
    }


    public void setHead(){
        if(direction == "Right"){
            setHeadRight();
        } else if (direction == "Left"){
            setHeadLeft();
        }
    }

    public void setHeadRight(){
        int headPositionRight[] = {30, 30};
        int headRightXPosition = headPositionRight[0];
        int headRightYPosition = headPositionRight[1];


        headRight.setBounds(headRightXPosition, headRightYPosition, 20,20);
        ImageIcon snakeHeadRight = new ImageIcon("img/snake-head-right.png");
        headRight.setIcon(snakeHeadRight);
        pGame.add(headRight);
    }

    public void setHeadLeft(){
        int headPositionLeft[] = {30, 30};
        int headLeftXPosition = headPositionLeft[0];
        int headLeftYPosition = headPositionLeft[1];

        JLabel headLeft = new JLabel();
        headLeft.setBounds(headLeftXPosition, headLeftYPosition, 20, 20);
        ImageIcon snakeHeadLeft = new ImageIcon("img/snake-head-left.png");
        headLeft.setIcon(snakeHeadLeft);
        pGame.add(headLeft);
    }
}
