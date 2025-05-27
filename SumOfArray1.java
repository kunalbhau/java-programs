class SumOfArray1{
   public static void main(String args [])
    {
	int [] arr = {1,2,3,4,5};
 int isEven =0;
 int isOdd =0;
	 
	 for(int i =0; i< arr.length; i++)
	   {
	   if(arr[i] % 2== 0)
	    {
		   isEven = isEven + arr[i];
		   }
		   else
		    {
			isOdd = isOdd + arr[i];
			}
	}
	System.out.println("sum of even number:" +isEven);
	
	System.out.println("sum of odd number:"  +isOdd);
	
	
	}
			}
	 
	 