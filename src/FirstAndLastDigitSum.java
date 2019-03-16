public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        if(number < 0){
            return -1;
        }

        int sum;
        int lastDigit = number % 10;
        int reversed = 0;

        while(number > 0){
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        int firstDigit = reversed%10;

        sum = lastDigit + firstDigit;


        return sum;
    }
}
