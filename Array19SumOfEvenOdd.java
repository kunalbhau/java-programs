public class Array19SumOfEvenOdd
{ 
  public static void main(String args [])
   {
   int [] arr = {1,3,4,5,6,78,7};
   int sum =0;
   int even =0;
   int odd =0;
   
   for (int i =0 ; i < arr.length; i++)
    {
	if(arr[i] % 2== 0)
	 {
		 even ++;
	 sum = sum + even;
	 System.out.println("Sum of even elements are :" +sum);
	 }
	 else
	 {
		 odd++;
	 sum = sum + odd;
	 System.out.println("Sum of odd elements are :" +sum);
	 }
	 
	 }
	 }
	 }