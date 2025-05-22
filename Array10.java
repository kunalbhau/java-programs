import java.util.Arrays;
public class Array10
 {
 public static void main(String args[])
 {
 int [] arr =  {1, 3, 4, 5, 3, 9};
 int count =0;
 System.out.println(Arrays.toString(arr));

  for (int i =0; i< arr.length; i++)
  {
	  if (arr[i] % 2 !=0)
	  {
	  System.out.println(arr[i]);
	  count ++;
	  System.out.println(count);
  }
  else
  {
	  System.out.println("even number");
  }
  
	  
}
}
 }