package com.codeandhacks.javaSnake;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        //Creating the windows of the game
        Window w = new Window();
        w.setLayout(null);

        setGamePanel(w);

        w.setVisible(true);
    }

    private static void setGamePanel(Window w){
        JPanel pGame = new JPanel();
        pGame.setLayout(null);
        pGame.setBounds(30,30, 400,400);
        pGame.setBackground(Colors.backgroundGame);

        setApple(pGame);

        w.add(pGame);

    }

    private static void setApple(JPanel panelGame){
        Apple a = new Apple();

        //get the randomPosition in the panel
        int appleRandomPosition[] = a.getRandomPosition(panelGame);

        int positionX = appleRandomPosition[0];
        int positionY = appleRandomPosition[1];

        //Label for the Apple
        JLabel appleLabel = new JLabel();
        appleLabel.setLayout(null);
        appleLabel.setBounds(positionX,positionY, 20,20);


        ImageIcon img = new ImageIcon("img/apple.jpg");
        appleLabel.setIcon(img);

        panelGame.add(appleLabel);



    }
}
