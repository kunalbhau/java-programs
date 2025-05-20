public class Array2
 {
 public static void main(String args [])
 {
 double [] arr = new double[3];
 arr[0] = 1.1;
 arr[1]= 1.2;
 arr[2] =1.3;
 //arr[3] =1.4; // Array index out of bound excpetion //
 //arr[4] =1.5; // Array index out of bound exception // 

 for (int i = 0; i< arr.length; i++) 
{
 System.out.println(arr[i]);
}
}
}