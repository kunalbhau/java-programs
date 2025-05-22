public class Array13
 {
 public static void main(String args [])
 {
 int arr[] ={3,4,5,6,6,7,8};
 
 int odd =0;
 for (int i =0; i< arr.length; i++)
 {
  if (arr[i] % 2 != 0)
  {
   odd++;
   }
   }
   System.out.println("Count of odd numbers are :" +odd);
   }
   }