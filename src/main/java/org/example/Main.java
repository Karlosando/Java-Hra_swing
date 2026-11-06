package org.example;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        setTitle("My Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        GameFrame gameFrame = new GameFrame();
        add(gameFrame);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

}