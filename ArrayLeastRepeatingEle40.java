import java.util.Arrays;
 public class ArrayLeastRepeatingEle40
 {
	 public static void main(String args[])
	 {
		 int [] arr ={5,5,3,3,1,4,2,2};
		 System.out.println(Arrays.toString(arr));
		 boolean[] trace = new boolean[arr.length];
		 
		 for (int i =0; i< arr.length; i++)
		 {
			 int count =0;
		 for (int j=0; j< arr.length; j++)
		 {
			 if(arr[i] == arr[j] && trace[j] == false)
			 {
				 count++;
				 trace[j] = true;
			 }
		 }
		 if(count == 1)
		 {
			 System.out.println("Least repeating elements are:" +arr[i] + " " +count);
		 }
		 }
	 }
 }
			 