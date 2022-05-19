package com.codeandhacks.javaSnake;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame{
    public Window(){
        this.setSize(800, 600);
        //Setting color background
        this.getContentPane().setBackground(Colors.backgroundWindow);
        this.setTitle("JAVA Snake by Julian Campos - CodeAndHacks.com");
        this.setResizable(false);

        //Setting the window at the center of screen
        setLocationRelativeTo(null);
    }
}
