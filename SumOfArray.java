public class SumOfArray 
  {
   public static void main(String args[])
    {
	 int [] numbers ={1,2,3,4,5};
	int sum = findSum(numbers);
	System.out.println("Sum of numbers is:" +sum);
	 }
	 public static int findSum (int [] arr)
	   {
	   int sum = 0;
	   for(int num : arr)
	    {
		 sum = sum +num;
		 }
		 return sum ;
		 }
		 }