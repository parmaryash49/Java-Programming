package com.company;
import  java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Blooddonate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your weight");
        float weight=sc.nextFloat();
//        if (age>18 && age<60)
//        {
//           if(weight>60 && weight<100)
//           {
//               System.out.println("you are eligible for blood dontate");
//           }
//        }
//        else{
//            System.out.println("you are not eligible for blood donate..");
//        }
        if ( (age>18 && age<60) && (weight>60 && weight<100)){
            System.out.println("you are eligbile for blood donate");
        }
        else{
            System.out.println("you are not eligbile");
        }
    }
}
