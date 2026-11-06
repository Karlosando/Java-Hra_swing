package org.example;

import java.awt.*;

public class Enemy {
    Player player;
    int x = 100;
    int y = 100;



    public void enemyMovement(Player player) {
        Rectangle zornePole = new Rectangle(this.x - 90, this.y - 90, 200, 200);
        if(zornePole.contains(player.x, player.y)) {
            if (player.x > x) {x++;}
            if (player.x < x) {x--;}
            if (player.y > y) {y++;}
            if (player.y < y) {y--;}
        }
    }


    public void draw(Graphics g) {
        Rectangle zornePole = new Rectangle(this.x - 90, this.y - 90, 200, 200);
        g.setColor(new Color(251, 222, 243));
        g.drawRect(zornePole.x, zornePole.y, zornePole.width, zornePole.height);
        g.setColor(new Color(208, 0, 255));
        g.fillRect(x, y, 20, 20);
    }
}
