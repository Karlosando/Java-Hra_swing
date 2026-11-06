package org.example;

import java.awt.*;

public class Enemy {
    Player player;
    int x = 100;
    int y = 100;

    public void enemyMovement(Player player) {
        if (player.x > x) {x++;}
        if (player.x < x) {x--;}
        if (player.y > y) {y++;}
        if (player.y < y) {y--;}
    }


    public void draw(Graphics g) {
        g.setColor(new Color(208, 0, 255));
        g.fillRect(x, y, 20, 20);
    }
}
