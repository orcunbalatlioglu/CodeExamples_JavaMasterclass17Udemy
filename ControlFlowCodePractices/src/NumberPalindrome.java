public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reversed = 0;
        int original = number;

        while(original != 0)
        {
            if(reversed == 0){
                reversed = original % 10;
            }
            else{
                reversed *= 10;
                reversed += original % 10;
            }
            original /= 10;
        }

        if(number == reversed)
            return true;
        return false;
    }
}
