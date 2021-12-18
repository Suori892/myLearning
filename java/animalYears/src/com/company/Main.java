package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	System.out.println("Write human years: ");
    int data = reader.nextInt();
    int[] arr = humanYearsCatYearsDogYears(data);
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
    }
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0, dogYears = 0, count = 0;
        if(humanYears <= 1){
            catYears += 15;
            dogYears += 15;
        } else if(humanYears <= 2){
            catYears += 24;
            dogYears += 24;
        }else{
            count = humanYears;
            count -= 2;
            catYears = 24 + (count * 4);
            dogYears += 24 + (count * 5);
        }
        return new int[]{humanYears,catYears,dogYears};
    }
}
