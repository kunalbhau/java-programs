class MakeAllElementsPrimeArray22 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i]+1;
            }
        }

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}