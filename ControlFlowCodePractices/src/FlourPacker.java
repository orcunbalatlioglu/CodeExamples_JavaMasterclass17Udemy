public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int maximumCapacity = bigCount * 5 + smallCount;
        if(goal > maximumCapacity)
            return false;

        while((bigCount > 0) || (smallCount > 0)){
            if(goal >= 5 && bigCount > 0){
                goal -= 5;
                bigCount--;
            }
            else if(smallCount > 0){
                goal--;
                smallCount--;
            }
            else if(smallCount == 0 && goal < 5)
                break;

            if(goal == 0)
                break;
        }
        return goal == 0;
    }
}
