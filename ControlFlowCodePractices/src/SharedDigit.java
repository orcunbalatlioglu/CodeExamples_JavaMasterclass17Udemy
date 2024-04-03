public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }

        int firstValue = firstNumber;
        int secondValue = secondNumber;
        int digit;

        while(firstValue != 0){
            digit = firstValue % 10;
            while(secondValue != 0){
                if(digit == secondValue % 10)
                    return true;
                secondValue /= 10;
            }
            secondValue = secondNumber;
            firstValue /= 10;
        }
        return false;

    }
}
