package com.company;
import java.sql.SQLOutput;
import  java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        System.out.println("Enter the marks of subject 1");
        sub1=sc.nextInt();
        System.out.println("Enter the marks of subject 2");
        sub2=sc.nextInt();
        System.out.println("Enter the marks of subject 3");
        sub3=sc.nextInt();
        System.out.println("Enter the marks of subject 4");
        sub4=sc.nextInt();
        System.out.println("Enter the marks of subject 5");
        sub5=sc.nextInt();
        int sum=sub1+sub2+sub3+sub4+sub5;
        float percentage=(float)(sum*100)/500;
        System.out.print("your total percentage is :");
        System.out.println(percentage);
    }
}
