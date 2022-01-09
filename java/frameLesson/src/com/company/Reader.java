package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Reader extends JFrame{
    JButton btn1, btn2;
    JLabel l1, l2, l3, l4;
    JTextField input1, input2;
    int num, num2;
    String ans1, ans2;
    eHandler handler = new eHandler();

    public Reader(){
        super("Jax");
        setLayout(new FlowLayout());
        btn1 = new JButton("Clear");
        btn2 = new JButton("Calculate");
        l1 = new JLabel("Write first number: ");
        l2 = new JLabel("Write second number: ");
        l3 = new JLabel("");
        l4 = new JLabel("");
        input1 = new JTextField(10);
        input2 = new JTextField(10);
        input1.setBorder(null);
        input2.setBorder(null);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Roboto", Font.PLAIN, 14));
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Roboto", Font.PLAIN, 14));
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Roboto", Font.PLAIN, 14));
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Roboto", Font.PLAIN, 14));
        btn1.setBackground(Color.decode("#5e3ddf"));
        btn1.setForeground(Color.WHITE);
        btn1.setBorderPainted(false);
        btn2.setBackground(Color.decode("#5e3ddf"));
        btn2.setForeground(Color.WHITE);
        btn2.setBorderPainted(false);
        add(l1);
        add(input1);
        add(l2);
        add(input2);
        add(btn1);
        add(btn2);
        add(l3);
        add(l4);
        btn2.addActionListener(handler);
        btn1.addActionListener(handler);

    }

    public  class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == btn2) {
                    num = Integer.parseInt(input1.getText());
                    num2 = Integer.parseInt(input2.getText());
                    num++;
                    num2++;
                    ans1 = String.valueOf(num);
                    ans2 = String.valueOf(num2);
                    input1.setText(ans1);
                    input2.setText(ans2);
                }
                if (e.getSource() == btn1) {
                    input1.setText("0");
                    input2.setText("0");
                }
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Write number!");
            }

            }
        }
    }

