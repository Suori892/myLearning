package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write number: ");
        int data = reader.nextInt();
	System.out.println(countingSheep(data));
    }
    public static String countingSheep(int num) {
        String text = " sheep...";
        String result = "";
        for(int i = 1; i <= num; i++){
            result += i + text;
        }
        return result;
    }
}
