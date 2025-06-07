import java.util.Scanner;
public class ArrayInput38
 {
 public static void main(String args[])
 {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the number of elements:");
 int size = sc.nextInt();
 
 // initialize an array with given size
 int [] numbers =new int [size] ;
 
 // Take user input to fill the array
 
 System.out.println("Enter" + size +"numbers");
 
 for (int i =0; i< size; i++)
 {
 System.out.println("elements" + (i+1) + ":");
 numbers[i] = sc.nextInt();
 }
 
 // print the array
 System.out.println("you entered");
 for (int number : numbers)
 {
 System.out.println(number + "");
 }
 }
 }