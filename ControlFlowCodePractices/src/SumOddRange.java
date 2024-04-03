public class SumOddRange {
    public static boolean isOdd(int number){
        if(number < 0)
            return false;
        if(number % 2 == 1)
            return true;
        return false;
    }

    public static int sumOdd(int begining, int end){
        if(begining <= 0 || end <= 0)
            return -1;
        if(begining > end)
            return -1;

        int sum = 0;

        for(int i = begining; i <= end; i++){
            if(isOdd(i))
                sum += i;
        }

        return sum;
    }
}
