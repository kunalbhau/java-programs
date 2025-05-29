import java.util.Arrays;

public class DuplicateElementsArray32 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 4, 5, 6};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Duplicate elements are: ");

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
