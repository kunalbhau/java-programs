public class Array1
 {
 public static void main(String args [])
 {
 int [] arr = new int [5];
 System.out.println(arr [0]);
 System.out.println(arr[1]);
 System.out.println(arr[2]);
 System.out.println(arr[3]);
 System.out.println(arr[4]);
 
 String [] arr2 = new String [3];
 //System.out.println(arr2['c']);   // out of bound exception //
 char [] ch = new char[2]; // this uncked exceptions
 System.out.println(ch['a']);
 System.out.println(ch['b']);
 }
 }