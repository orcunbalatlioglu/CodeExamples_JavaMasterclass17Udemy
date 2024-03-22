public class Challenge {
    public static void main(String[] args) {
        double firstDoubleValue = 20.00;
        double secondDoubleValue = 80.00;
        double sumAndMultipliedWith100 = (firstDoubleValue + secondDoubleValue) * 100;
        double remainder = sumAndMultipliedWith100 % 40.00;
        boolean isRemainderZero = remainder == 0.00 ? true : false;
        System.out.println(isRemainderZero);
        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
