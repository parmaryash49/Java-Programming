package com.company;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your age");
        int age=sc.nextInt();
        switch (age) {
            case 60 -> System.out.println("you are old");
            case 18 -> System.out.println("you are adult");
            case 25 -> System.out.println("get job");
            default -> System.out.println("enjoy your life...");

        }

    }
}
