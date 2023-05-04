public class Armstrong{

    public static void main (string [] args){
        int number =371, originalNumber, remainder, result =0;

        originalNumber =number;

        while(originalNumber != 0)


        {
            remainder=originalNumber % 10;
            result += math.pow(remainder, 3);
            originalNumber /= 10;

        }
        if(result == number)

        system.out.println(number +"is an armstrong number.");

        else

        system.out.println(number +"is not an armstrong number.");

            }

}