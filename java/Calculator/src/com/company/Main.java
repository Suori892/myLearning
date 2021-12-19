package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String error = "Something going wrong";
        Scanner reader = new Scanner(System.in);
	System.out.println("This is my first java calculator");
        System.out.println("Choose + - * / ^ % operations");
        char operation = reader.next().charAt(0);
        System.out.println("Write first number");
        int num1 = reader.nextInt();
        System.out.println("Write second number");
        int num2 = reader.nextInt();
        double result = 0;

        switch (operation){
            case '+' : result = num1 + num2;
                return;
            case '-' : result = num1 - num2;
                break;
            case '*' : result = num1 * num2;
                break;
            case '/' : result = num1 / num2;
                break;
            case  '^' : result = Math.pow(num1, num2);
                break;
            case '%' : result = num1 %num2;
                break;
            default: System.out.println("Something going wrong!");
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
