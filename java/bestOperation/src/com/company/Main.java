// This script the biggest value of 3 numbers using operation (), +,*
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write three numbers: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        int num3 = reader.nextInt();
        System.out.println(expressionsMatter(num1, num2, num3));
    }
    public static int expressionsMatter(int a, int b, int c)
    {
        int[] myArray = {a+b+c, a*b*c, a+b*c, a*b+c, (a+b)*c, a*(b+c)};
        int max = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        return max;
    }
}
