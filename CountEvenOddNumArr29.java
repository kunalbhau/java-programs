// give count of even and odd numbers //
  public class CountEvenOddNumArr29
  {
   public static void main(String args[])
   {
   int arr[] = { 1,2,3,4,5,6,7,8,9};
   int even =0;
   int odd =0;
   
   for (int i =0 ; i< arr.length; i++)
   {
   if(arr[i] % 2 ==0 )
   {
   even ++;
   }
   else
   { odd++;}
   }
   System.out.println("Count of even number are :" +even);
   System.out.println("Count of odd numbers are :" +odd);
   
   }
   }