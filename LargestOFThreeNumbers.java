package com.bridgelabz;

import java.util.Scanner;

public class LargestOFThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int largestNum = 0;

        if (num1>largestNum){
            largestNum=num1;
        }
        if (num2>largestNum){
            largestNum=num2;
        }
        if (num3>largestNum){
            largestNum=num3;
        }

        System.out.println("The largest number is = "+largestNum);
    }
	
}
