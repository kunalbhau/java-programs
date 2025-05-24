public class ReverseArrayElements23
{
	public static void main(String args[])
	{
		int  [] arr = {1,3,4,6,7,8,8};
		
		for (int i = arr.length-1; i > 0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}
}