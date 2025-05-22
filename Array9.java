import java.util.Arrays;
public class Array9
 {
 public static void main(String args[])
  {
  int  [] arr = { 1, 3, 5, 6, 7,9};
  
  for (int i =0 ; i< arr.length; i++)
  {
    if(arr[i] % 2 != 0)
	{
	System.out.println(arr[i]);
	}
	else
	{
	System.out.println("not an odd number");
	}
	}
	System.out.println(Arrays.toString(arr));
	
	}
	}
	