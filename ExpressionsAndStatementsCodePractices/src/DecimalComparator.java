public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        long firstRounded = (long) (firstValue * 1000);
        long secondRounded = (long) (secondValue * 1000);
        return firstRounded == secondRounded;
    }
}
