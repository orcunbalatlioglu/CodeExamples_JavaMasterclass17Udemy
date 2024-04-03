public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int smallerValue = 0;

        if(first < second){
            smallerValue = first;
        }
        else{
            smallerValue = second;
        }

        for(int i = smallerValue; i >= 0; i--){
            if((first % i == 0) && (second % i == 0)){
                return i;
            }
        }
        return -1;
    }
}
