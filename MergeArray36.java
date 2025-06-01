// Merge arrays //
public class MergeArray36
{
	public static void main(String args[])
	{
		int [] a ={1,2,3,4,5,6};
		int [] b ={6,7,8,9,10};
		int []c =new int[a.length + b.length];
		
		int k =0;
		
		// copy all the elments of a array
		for (int i =0; i< a.length; i++)
		{
			c[k++] = a[i];
		}
		//copy all the elements of b array
		for (int j =0; j< b.length; j++)
		{
			c[k++] = b[j];
		}
		// print array k 
		System.out.println("Merged array");
		for (int i =0 ; i< c.length; i++)
		{
			System.out.print(c[i] + "");
		}
	}
}