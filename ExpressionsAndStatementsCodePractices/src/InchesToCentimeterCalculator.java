public class InchesToCentimeterCalculator {
    public static double ConvertToCentimeters(int foot){
        return (double) 12*foot*2.54;
    }
    public static double ConvertToCentimeters(int foot, int inch){
        return (double) (12*foot*2.54) + (double) inch*2.54;
    }
}


