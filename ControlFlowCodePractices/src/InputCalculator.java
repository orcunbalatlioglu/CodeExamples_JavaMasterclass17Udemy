import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        int inputNumber;
        boolean isInt = true;

        do{
            try{
                inputNumber = Integer.parseInt(sc.nextLine());
                counter++;
                sum += inputNumber;
                avg = Math.round((double) sum / counter);
            }
            catch(NumberFormatException ex){
                isInt = false;
            }

        } while(isInt);

        sc.close();
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}