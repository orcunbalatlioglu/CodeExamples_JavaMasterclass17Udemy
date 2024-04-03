public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0)
            return -1;

        int original = number;
        int firstDigit = original % 10;
        int lastDigit = original % 10;
        original /= 10;

        while(original != 0){
            lastDigit = original % 10;
            original /= 10;
        }
        return firstDigit + lastDigit;
    }
}