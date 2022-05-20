package com.codeandhacks.javaSnake;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        //Creating the windows of the game
        Window w = new Window();
        w.setLayout(null);

        Game game = new Game(w);

        w.setVisible(true);
    }
}
