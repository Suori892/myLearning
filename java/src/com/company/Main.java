package com.company;

import java.util.Scanner;

public class Main {

    public static int searching(int[] arr, int num){
        int counter = 0;
        int size = arr.length;
        int low = 0;
        int high = size - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (num == arr[mid]){
                counter++;
                System.out.println("Your number is " + arr[mid] + " !");
                System.out.println("We had " + counter + " operations.");
                return 0;
            } else if(num > arr[mid]){
                counter++;
                low = mid + 1;
            } else {
                counter++;
                high = mid + 1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
	int [] numbers;
    int value;
        Scanner reader = new Scanner(System.in);
        System.out.println("How many numbers contains your array?");
        int arrLength = reader.nextInt();
        numbers = new int[arrLength];
        System.out.println("Write your numbers: ");

        for(int i = 1; i <= arrLength; i++){
            System.out.println("Enter a [" + i + "] = ");
             numbers[i-1] = reader.nextInt();
        }
        System.out.println("And now print value wich we will find: ");
        value = reader.nextInt();
    searching(numbers, value);
    }
}
