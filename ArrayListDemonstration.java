import java.util.*;
public class ArrayListDemonstration
{
	public static void main(String args[])
	{
		ArrayList <Integer> a1 = new ArrayList<Integer> ();
		
		for (int i =1; i < 5; i++)
		{
			a1.add(i);
			System.out.println(a1);
		}
		// remove element from 3 index
		a1.remove(3);
		// printing after removing
		System.out.println(a1);
		
		for (int i =1; i< a1.size(); i++)
		{
			System.out.println(a1.get(i) + " ");
		}
		
		
	}
}