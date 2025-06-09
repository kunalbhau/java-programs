import java.util.Arrays;
public class ArrayMergeSort39
 {
 public static void main(String args [])
 {
 int [] a = {5, 15, 25, 33, 62, 103};
 int [] b = {3,4,9,22,31,44,50, 62, 90,200,405};
 int ans[] = new int[a.length + b.length];
 
 int i=0, j=0, k=0;
 while(i < a.length && j < b.length)
 {
  if(a[i] < b[j])
  {
   ans[k] = a[i];
   i++;
   k++;
   }
   else if(a[i] >= b[j])
   {
   ans[k] = b[j];
   j++;
   k++;
   }
   }
   while(i< a.length)
   {
   ans[k++] = a[i++];
   }
   while(j< b.length)
   {
   ans[k++] = b[j++];
   }
   System.out.println(Arrays.toString(ans));
   }
   }