// Frequency of elements in an array //
import java.util.Arrays;
public class FrequencyOfElements34
 {
 public static void main(String [] args)
 {
 int [] arr = {1,3,4,5,6,7,85,4,3,2};
System.out.println(Arrays.toString(arr));
boolean trace[] = new boolean[arr.length];

for (int i = 0; i< arr.length; i++)
 {
 int cnt =0;
 for (int j =0; j< arr.length; j++)
 {
 if (arr[i] == arr[j] && trace[j] == false)
 {
 cnt++;
 trace[j] = true;
 }
 }
 if (cnt != 0)
 {
 System.out.println(arr[i] + " " +cnt);
 }
 }
 }
 }
