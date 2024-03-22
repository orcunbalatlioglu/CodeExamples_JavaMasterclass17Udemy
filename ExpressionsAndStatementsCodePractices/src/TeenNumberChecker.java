public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third){
        if( isTeen(first) || isTeen(second) || isTeen(third) )
            return true;
        return false;
    }

    public static boolean isTeen(int value){
        if(value >=13 && value <=19)
            return true;
        return false;
    }
}
