  import java.util.Arrays;
  public class Array11
  {
  public static void main(String args [])
  {
  int [] arr = {1,3,4,5,6,7,8};
  int even =0;
  int odd =0;
  
  for (int i =0; i< arr.length; i++)
  {
   if(arr[i] % 2 == 0)
   {
    even ++;
	}
	else
	{
	odd++;
	}
	System.out.println("count of even number is :" +even );
	System.out.println("count of odd numbers are :" +odd);
	}
	}
	}