package org.example;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel {
    Player player = new Player();
    Enemy enemy = new Enemy();

    public GameFrame() {
        setFocusable(true);
        addKeyListener(player);




        Timer timer = new Timer(16, e -> {
            player.movement();
            enemy.enemyMovement(player);
            repaint();
        });
        timer.start();
    }





    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(0, 88, 2));

        g.fillRect(0,0,800,600);

        g.setColor(new Color(255, 0, 0));

        g.fillRect(0, 0, 800, 20);
        g.fillRect(0, 0, 20, 800);
        g.fillRect(0, 555, 800, 20);
        g.fillRect(780, 0, 20, 800);

        player.draw(g);
        enemy.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }
}
