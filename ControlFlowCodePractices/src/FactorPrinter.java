import java.util.StringJoiner;
public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }

        StringJoiner strJoiner = new StringJoiner(" ");

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                strJoiner.add(String.valueOf(i));
            }
        }
        System.out.print(strJoiner);
    }
}
