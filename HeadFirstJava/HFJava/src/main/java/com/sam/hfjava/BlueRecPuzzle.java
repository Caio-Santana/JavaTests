/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sam.hfjava;

import java.awt.*;
import javax.sound.midi.ControllerEventListener;
import javax.swing.*;

/**
 *
 * @author Caio
 */
public class BlueRecPuzzle {

    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        BlueRecPuzzle gui = new BlueRecPuzzle();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++, y++, x++) {
            x++;
            drawP.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }

    class MyDrawP extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 500, 250);

            g.setColor(Color.BLUE);
            g.fillRect(x, y, (500 - x * 2), (250 - y * 2));
            //g.fillRect(x, y, (x - 500), (y - 250));
            //g.fillRect((500 - x * 2), (250 - y * 2), x, y);
        }
    }
}
