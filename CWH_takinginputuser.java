package com.company;
import java.util.Scanner;

public class CWH_takinginputuser{
    public static void main (String []args){
        System.out.println("The user input is:");
        Scanner sc = new Scanner (System.in);

        // System.out.println("Enter number 1 :");
        // int a = sc.nextInt();
        
        // System.out.println("Enter number 2:");
        // float b = sc.nextFloat();

        // System.out.println("Enter number 3 :");
        // int c =sc.nextInt();

        // float  sum =a+b+c;
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        // System.out.println("The sum is:");
        // System.out.println(sum);
        
        String str = sc.nextLine();
        System.out.println(str);
        
    }
}