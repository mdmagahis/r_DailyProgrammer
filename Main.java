package com.r_DailyProgrammer_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("r/DailyProgrammer challenge #1");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your reddit name: ");
        String rName = input.next();

        if (age > 1){
            System.out.println("Your name is " + name + ", you are " + age + " year old, and your username is " + rName + ".");
        }
        else {
            System.out.println("Your name is " + name + ", you are " + age + " years old, and your username is " + rName + ".");
        }

        input.close();
    }
}
