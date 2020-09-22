package com.company;
import java.util.Scanner;
import  java.util.Random;

public class Exercise_2_Rock_Paper_Sizzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int min=1;
        int tie=0;
        int User_choice=0;
        int chance=1;
        int total_chance=5;
        int User_point=0;
        int computer_choice=0;
        int computer_point=0;
        while (chance<=total_chance)
        {
            System.out.println("1:Rock 2:Paper 3:Sizzer");
            User_choice=sc.nextInt();
            computer_choice=ran.nextInt(3)+min;
            System.out.println(User_choice);
            System.out.println(computer_choice);
            if (User_choice==computer_choice){
                System.out.println("tie game ,both choose same..");
                tie+=1;
            }
//            this is for choice 1
            else if(User_choice==1 && computer_choice==2){
                System.out.println("computer wins..");
                computer_point+=1;
            }
            else if(User_choice==1 && computer_choice==3){
                System.out.println("You win..");
                User_point+=1;
            }

//            this is  for choice 2
            else if(User_choice==2 && computer_choice==3){
                System.out.println("computer wins..");
                computer_point+=1;
            }
            else if(User_choice==2 && computer_choice==1){
                System.out.println("You win..");
                User_point+=1;
            }

//            this is for choice no 3
            else if(User_choice==3 && computer_choice==1){
                System.out.println("computer wins..");
                computer_point+=1;
            }
            else if(User_choice==3 && computer_choice==2){
                System.out.println("You win..");
                User_point+=1;
            }
            chance+=1;
        }
        System.out.println("Computers point:"+computer_point);
        System.out.println("Your points:"+User_point);
        System.out.println("total tie:"+tie);
    }
}
