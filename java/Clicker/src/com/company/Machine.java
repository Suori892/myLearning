package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Machine extends  JFrame {
JButton btn1, btn2;
    JLabel l1;
    eHandler handler = new eHandler();
    int num = 0;
public Machine(){
    super("Clicker");
    setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
    btn1 = new JButton("Click");
    btn2 = new JButton("Reset");
    l1 = new JLabel("Your number is: " + num);
    l1.setHorizontalTextPosition(JLabel.CENTER);
    add(l1);
    add(btn1);
    add(btn2);
    btn2.addActionListener(handler);
    btn1.addActionListener(handler);
}

public class eHandler implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            num++;
            l1.setText("Your number is: " + num);
        }
        if(e.getSource() == btn2){
            num = 0;
            l1.setText("Your number is: " + num);
        }
    }
}

}
