public class Array18SumOfOdd
 {
 public static void main(String args[])
 {
 int sum = 0;
 int arr [] = {9,4,6, 3, 6,3};
 
 for(int i =0 ; i< arr.length; i++)
  {
   if(arr[i] % 2 !=0 )
   {
    sum = sum + arr[i];
	}
	}
	System.out.println("Sum of odd elemetns are :" +sum);
	}
	}
	