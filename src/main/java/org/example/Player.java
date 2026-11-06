package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Player implements KeyListener, MouseListener {

    boolean up,left,down,right,shift;

    int x=50;
    int y=50;


    int speed = 2;

    public void draw(Graphics g) {
        g.setColor(new Color(0, 255, 214));
        g.fillRect(x,y,20,20);
    }


    public void movement() {
        if (up == true) {y-= speed;}
        if (left == true) {x-= speed;}
        if (down == true) {y+= speed;}
        if (right == true) {x+= speed;}
        if (shift == true) {speed = 4;} else {speed = 2;}

        if (y < 20) {y = 20;}
        if (x < 20) {x = 20;}
        if (y > 535) {y = 535;}
        if (x > 760) {x = 760;}
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W) up = true;
        if(key == KeyEvent.VK_A) left = true;
        if(key == KeyEvent.VK_S) down = true;
        if(key == KeyEvent.VK_D) right = true;
        if(key == KeyEvent.VK_SHIFT) shift = true;
    }


    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W) up = false;
        if(key == KeyEvent.VK_A) left = false;
        if(key == KeyEvent.VK_S) down = false;
        if(key == KeyEvent.VK_D) right = false;
        if(key == KeyEvent.VK_SHIFT) shift = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}










    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}
}
