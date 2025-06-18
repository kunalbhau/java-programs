public class RecPower {
    public static void main(String args[]) {
        int base = 2;
        int raise = 3;
        System.out.println(power(base, raise)); // prints 8
    }

    public static int power(int base, int raise) {
        if (raise == 0) {
            return 1;
        }
        return base * power(base, raise - 1);
    }
}
