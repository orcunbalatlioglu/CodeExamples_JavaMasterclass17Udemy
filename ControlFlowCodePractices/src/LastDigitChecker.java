public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstValue, int secondValue, int thirdValue){
        if(!isValid(firstValue) || !isValid(secondValue) || !isValid(thirdValue))
            return false;
        if( (firstValue % 10 == secondValue % 10) || (secondValue % 10 == thirdValue % 10) || (firstValue % 10 == thirdValue % 10) )
            return true;
        return false;
    }

    public static boolean isValid(int value){
        if(value < 10 || value > 1000)
            return false;
        return true;
    }
}
