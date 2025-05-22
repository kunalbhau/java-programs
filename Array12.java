// even number count
public class Array12
 {
 public static void main (String args [])
 {
 int [] arr = {1, 2, 3,4, 5, 6,7};
 int even =0;
 
 for (int i =0; i < arr.length; i++)
 {
  if(arr[i] % 2 ==0)
  {
    even ++;
	}
	}
	System.out.println("count of even numbers are :" +even);
	}
	}