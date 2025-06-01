public class MergeArrayWithMaximum37 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 3, 4, 5, 5};
        int[] c = new int[a.length + b.length];

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[k++] = b[j];
        }

        // Print merged array
        System.out.println("Merged array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // Find the element with maximum frequency
        int max = 0;
        int ele = c[0];

        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ele = c[i];
            }
        }

        System.out.println("Element with highest frequency: " + ele + " (occurs " + max + " times)");
    }
}
