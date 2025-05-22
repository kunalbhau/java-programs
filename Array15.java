import java.util.Arrays;
import java.util.Scanner;
public class Array15
 {
 public static void main(String args [])
 {
	 Scanner sc = new Scanner (System.in);
	 
 int arr [] = {1,2,4,5,6,7,8,9};

 
 for (int i =0; i< arr.length; i++)
 {
 if(arr[i] % 2 ==0)
 {
 System.out.println("Even numbers are :" +arr[i]);
 }
 else
 {
 System.out.println("Odd numbers are :" +arr[i]); 
 }
 }
 
 System.out.println(Arrays.toString(arr));
 }
 }