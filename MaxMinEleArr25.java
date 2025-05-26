import java.util.Arrays;
public class MaxMinEleArr25
{
 public static void main (String args [])
 {
 int arr[] = {1,3,5,6,7,8,5,4};
 int max = Integer.MIN_VALUE;
 int min = Integer.MAX_VALUE;
 
 
 for (int ele : arr)
  {
  if (max < ele)
  
  max = ele;
  
  if(min > ele)
  min = ele;
  }
  System.out.println("max elements is :" +max);
  System.out.println("min elements is : " +min);
  System.out.println(Arrays.toString (arr));
  }
  }
  