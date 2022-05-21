package com.codeandhacks.javaSnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private Window w;
    private JPanel pGame = new JPanel();
    private JPanel pAccesorios = new JPanel();
    private JLabel appleLabel = new JLabel();

    JLabel newAppleLabel = new JLabel();
    private boolean isGameFinished = false;


    public Game(Window w) {
        this.w = w;
        setComponents();

    }

    public void setComponents(){
        setPanels();
        setApple();
        setButtonRestart();
        setSnake();
    }

    public void setPanels(){
        pGame.setLayout(null);
        pGame.setBounds(30,30, 400,400);
        pGame.setBackground(Colors.backgroundGame);
        w.add(pGame);

        pAccesorios.setLayout(null);
        pAccesorios.setBounds(465, 350, 300, 100);
        pAccesorios.setBackground(Colors.backgroundGame);
        w.add(pAccesorios);
    }

    public void setButtonRestart(){
        JButton bRestart = new JButton();
        bRestart.setLayout(null);
        bRestart.setBounds(20,20, 200,50);
        bRestart.setText("Reiniciar");
        pAccesorios.add(bRestart);
        ActionListener l = e -> restartApple();
        bRestart.addActionListener(l);
    }

    public void setApple(){
        int appleRandomPosition[] = Apple.getRandomPosition(pGame);
        int positionX = appleRandomPosition[0];
        int positionY = appleRandomPosition[1];

        appleLabel.setLayout(null);
        appleLabel.setBounds(positionX,positionY, 20,20);
        ImageIcon img = new ImageIcon("img/apple.jpg");
        appleLabel.setIcon(img);
        pGame.add(appleLabel);
        //We need return the new position (or the hitbox)


    }

    public void restartApple(){
        pGame.repaint();
        pGame.remove(appleLabel);
        pGame.remove(newAppleLabel);

        int appleRandomPosition[] = Apple.getRandomPosition(pGame);
        int positionX = appleRandomPosition[0];
        int positionY = appleRandomPosition[1];

        newAppleLabel.setLayout(null);
        newAppleLabel.setBounds(positionX,positionY, 20, 20);
        ImageIcon img = new ImageIcon("img/apple.jpg");
        newAppleLabel.setIcon(img);
        pGame.add(newAppleLabel);

        //We need return the new position (or the hitbox)

    }

    public void setSnake(){
        Snake snake = new Snake(w, pGame);
    }
}
