package com.fansolomon.Behavioral.Observer.Child;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * java中awt对观察者模式的运用
 */
public class TestFrame extends Frame {
    public void launch() {
        java.awt.Button b = new java.awt.Button("press me");
        b.addActionListener((java.awt.event.ActionListener) new MyActionListener());
        b.addActionListener((java.awt.event.ActionListener) new MyActionListener2());
        this.add(b);
        this.pack();

        this.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
        this.setLocation(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame().launch();
    }

    private class MyActionListener implements java.awt.event.ActionListener { //Observer
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            ((java.awt.Button)e.getSource()).setLabel("press me again!");
            System.out.println("button pressed!");
        }
    }

    private class MyActionListener2 implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.out.println("button pressed 2!");
        }
    }
}
