package com.company;
import javax.swing.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
    Machine frame = new Machine();
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    }
}
