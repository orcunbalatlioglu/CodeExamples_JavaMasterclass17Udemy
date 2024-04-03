import java.util.List;
import java.util.ArrayList;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1)
            return false;

        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = number - 1; i > 0; i--){
            if(number % i == 0)
                divisors.add(i);
        }

        int sumOfDivisors = 0;
        for(int divisor: divisors){
            sumOfDivisors += divisor;
        }
        return sumOfDivisors == number;
    }
}
