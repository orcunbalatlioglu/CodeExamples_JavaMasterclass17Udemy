import java.util.StringJoiner;

public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        StringJoiner strJoiner = new StringJoiner(" ");
        int reversedValue = reverse(number);

        for(int i = 0; i < getDigitCount(number); i++){
            switch(reversedValue % 10){
                case 0 -> strJoiner.add("Zero");
                case 1 -> strJoiner.add("One");
                case 2 -> strJoiner.add("Two");
                case 3 -> strJoiner.add("Three");
                case 4 -> strJoiner.add("Four");
                case 5 -> strJoiner.add("Five");
                case 6 -> strJoiner.add("Six");
                case 7 -> strJoiner.add("Seven");
                case 8 -> strJoiner.add("Eight");
                case 9 -> strJoiner.add("Nine");
            }
            reversedValue /= 10;
        }
        System.out.println(strJoiner);
    }
    public static int reverse(int number){
        int reversedValue = 0;
        int numberPositiveValue = Math.abs(number);

        while(numberPositiveValue > 0){
            reversedValue *= 10;
            reversedValue += numberPositiveValue % 10;
            numberPositiveValue /= 10;
        }

        return number < 0 ? reversedValue * -1 : reversedValue;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int digitCount = 0;
        long temp = 1;
        while (temp <= number) {
            digitCount++;
            temp *= 10;
        }

        return number == 0 ? 1 : digitCount;
    }
}
