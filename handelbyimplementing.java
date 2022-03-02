package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Event extends Frame implements ActionListener{
    TextField tf;
    @Override
    public void actionPerformed(ActionEvent e) {
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        Button b = new Button("Submit");
        b.setBounds(100,120,80,30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
    public void actionPerformed() {

    }
}
public class handelbyimplementing {
    public static void main(String[] args) {
        Event e = new Event();
        e.actionPerformed();
        e.actionPerformed();
    }
}
