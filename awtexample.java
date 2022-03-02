package com.company;

import java.awt.*;

class awt extends Frame{
    awt(){
        Label l = new Label("Employee id:");
        Button b = new Button("Submit");
        TextField t = new TextField();
        l.setBounds(20,80,80,30);
        b.setBounds(120,100,80,30);
        t.setBounds(20,100,80,30);
        add(l);
        add(t);
        add(b);
        setSize(300,300);
        setTitle("Employee info..");
        setLayout(null);
        setVisible(true);


    }
}
public class awtexample {
    public static void main(String[] args) {
        awt a = new awt();
    }
}
