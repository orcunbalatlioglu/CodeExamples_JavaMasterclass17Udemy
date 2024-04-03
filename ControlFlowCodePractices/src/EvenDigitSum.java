public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        int original = number;
        int digit;
        int sumOfEvenDigits = 0;
        while(original != 0){
            digit = original % 10;
            if(digit % 2 == 0)
                sumOfEvenDigits += digit;
            original /= 10;
        }
        return sumOfEvenDigits;
    }
}