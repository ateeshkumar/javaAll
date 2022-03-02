package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class first extends Frame{
    first(){
        Button b = new Button("Click me!");
        b.setBounds(0,0,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }
}
public class frame {
    public static void main(String[] args) {
        first f = new first();
    }
}
