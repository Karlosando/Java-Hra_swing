package org.example;

import java.awt.*;
import java.util.Random;

public class Enemy {
    Random random = new Random();;
    int x = 100;
    int y = 100;

    int casovac = 0;
    ;

    int smerHlidkovani;

    public void enemyMovement(Player player) {
        Rectangle zornePole = new Rectangle(this.x - 90, this.y - 90, 200, 200);
        Rectangle hpBar = new Rectangle(player.x - 10, player.y - 10, 40, 40);
        if (zornePole.contains(player.x, player.y)) {
            if (player.x > x) {
                x++;
            }
            if (player.x < x) {
                x--;
            }
            if (player.y > y) {
                y++;
            }
            if (player.y < y) {
                y--;
            }
        } else {
            casovac++;
            if (casovac > 300) {
                smerHlidkovani = random.nextInt(5);
                casovac = 0;
            }
            if (smerHlidkovani == 0) {
                x++;
            }
            if (smerHlidkovani == 1) {
                x--;
            }
            if (smerHlidkovani == 2) {
                y++;
            }
            if (smerHlidkovani == 3) {
                y--;
            }
            if (smerHlidkovani == 4) {
                // No movement
            }
        }

        if (y < 20) {y = 20;}
        if (x < 20) {x = 20;}
        if (y > 535) {y = 535;}
        if (x > 760) {x = 760;}

    }


    public void draw(Graphics g) {
        Rectangle hpBar = new Rectangle(this.x - 10, this.y - 10, 40, 5);
        g.setColor(new Color(8, 255, 0));
        g.fillRect(hpBar.x, hpBar.y, hpBar.width, hpBar.height);
        Rectangle zornePole = new Rectangle(this.x - 90, this.y - 90, 200, 200);
        g.setColor(new Color(251, 222, 243));
        g.drawRect(zornePole.x, zornePole.y, zornePole.width, zornePole.height);
        g.setColor(new Color(208, 0, 255));
        g.fillRect(x, y, 20, 20);
    }
}