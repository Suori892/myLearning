package com.company;


import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
    Reader frame = new Reader();
    ImageIcon img = new ImageIcon("src/com/company/google-stadia-logo-hd4.png");
    frame.setIconImage(img.getImage());
    frame.setVisible(true);
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.getContentPane().setBackground( Color.decode("#121212"));
    }
}
