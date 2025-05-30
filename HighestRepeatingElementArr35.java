// Highest repeating element in an array//
import java.util.Arrays;
public class HighestRepeatingElementArr35
{
	public static void main(String args[])
	{
		int [] arr = {1,2,3,4,5,5,6,6,7,7,7};
		System.out.println(Arrays.toString(arr));
		boolean [] visited = new boolean[ arr.length];
		int max =0 ;
		int ele =0;
		
		for(int i = 0; i< arr.length; i++)
		{
			int cnt =0;
			for (int j =0 ; j< arr.length; j++)
			{
				if(arr[i] == arr [j] && visited[j] == false)
				{
					cnt ++;
					visited[j] = true;
				}
			}
			if (cnt != 0)
			{
				if (max < cnt)
				{
					max = cnt;
					ele = arr[i];
				}
			}
			System.out.println(arr[i] + "   " +cnt);
		}
		System.out.println("Highest repeating element in array is :" +max );
	}
}
			