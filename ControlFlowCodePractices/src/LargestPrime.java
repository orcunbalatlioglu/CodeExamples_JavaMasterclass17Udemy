public class LargestPrime {
    public static int getLargestPrime(int number){
        int biggestPrimeFactor = -1;
        if(number < 0)
            return biggestPrimeFactor;

        for(int i = 2; i <= number; i++){
            if(number % i == 0){
                int factor = i;
                boolean isPrime = true;

                for (int factorOfFactor = 2; factorOfFactor <= Math.sqrt(factor); factorOfFactor++){
                    if (factor % factorOfFactor == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    biggestPrimeFactor = factor;
            }
        }

        return biggestPrimeFactor;
    }
}