package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(200)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("So.....?");
        int customerInt1 = scanner.nextInt();
        System.out.println("and....?");
        int customerInt2 = scanner.nextInt();
        System.out.println("------------------------------------------------");
        System.out.println(victory(randomInt, customerInt1, customerInt2));
        //System.out.println(randomInt == customerInt?"You Win!!":"NNN.....NO");
        System.out.println("randomInt = " + randomInt);
        System.out.println("& = " + (customerInt1&customerInt2));
        System.out.println("| = " + (customerInt1|customerInt2));
        System.out.println("^ = " + (customerInt1^customerInt2));
        //System.out.println("customerInt = " + customerInt);
        //int i = 5;
        //int a = 6%4;
        //i = i++;
        //System.out.println(a);

    }
    public static String victory (int randomInt, int customerInt1, int custimerInt2){
        return randomInt == (customerInt1&custimerInt2) ||
                randomInt == (customerInt1|custimerInt2) ||
                randomInt == (customerInt1^custimerInt2)?
                "You Win!":"MMM...No";
    }
}
