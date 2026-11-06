package org.example;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JPanel {
    Player player = new Player();
    Enemy enemy = new Enemy();
    Enemy enemy1 = new Enemy();

    public GameFrame() {
        setFocusable(true);
        addKeyListener(player);
        addMouseListener(player);




        Timer timer = new Timer(16, e -> {
            player.movement();
            player.attack(enemy);
            enemy.enemyMovement(player);
            player.attack(enemy1);
            enemy1.enemyMovement(player);
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
        enemy1.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }
}
