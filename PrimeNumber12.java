public class PrimeNumber12
 {
 public static void main(String args[])
  {
  int num =7;
  boolean isPrime =true;
  
  if(num <= 1)
   isPrime = false;
   for (int i = 2;  i < num ; i++)
   {
   if(num % 2 ==0)
   {
    isPrime = false;
	break ;
	}
   if(isPrime )
   {
    System.out.println("the number is prime");
	}
	else
	{
	System.out.println("The number is not prime");
	}
	}
	}
	}