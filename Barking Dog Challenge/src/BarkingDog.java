public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking , int hourOfTheDay) {
        if (hourOfTheDay<0 || hourOfTheDay > 23){
            return false;
        }
       if (barking && (hourOfTheDay < 8|| hourOfTheDay>22)){
           return true;
       }else {
           return false;
       }


    }
}
