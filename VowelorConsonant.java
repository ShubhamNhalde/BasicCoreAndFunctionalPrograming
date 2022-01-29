package com.bridgelabz;

import java.util.Scanner;

public class VowelorConsonant {

    public static void main(String[] args) {

        boolean vowel=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        char alphabet = scanner.next().charAt(0);

        char[] vowels = {'a','e','i','o','u'};

        for (char item : vowels) {
            if (alphabet == item) {
                vowel = true;
                break;
            }
        }
        if (vowel){
            System.out.println( alphabet + " is a Vowel");
        }else
            System.out.println( alphabet + " is a Consonant");
    }
	
}
