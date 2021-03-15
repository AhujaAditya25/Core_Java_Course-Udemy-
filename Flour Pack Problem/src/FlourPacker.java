public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else if (bigCount > 0 && smallCount == 0) {
            bigCount *= 5;
            if (bigCount == goal) {
                return true;
            }
        } else if ((bigCount == 0 && smallCount > 0) && (smallCount >= goal)) {
            return true;
        } else{
            int divgoal = goal / 5;
            int remgoal = goal % 5;
            if (bigCount >= divgoal && smallCount >=remgoal){
                return true;
            }
            else if (bigCount < divgoal && smallCount >remgoal && bigCount*5 + smallCount >= goal ){
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        boolean a = canPack(2,10,18);
        System.out.println( "BigCount : 2 , SmallCount = 10, Goal = 18 , ans : "+a);
        boolean b = canPack(0,4,4);
        System.out.println("BigCount : 0 , SmallCount = 4, Goal = 4 , ans  : "+b);
        boolean c = canPack(2,2,12);
        System.out.println("BigCount : 2 , SmallCount = 2, Goal = 12 , ans : "+c);
        boolean d = canPack(1,2,10);
        System.out.println("BigCount : 1 , SmallCount = 2, Goal = 10 , ans : "+d);
        boolean e = canPack(0,-1,1);
        System.out.println("BigCount : 0 , SmallCount = -1, Goal = 1 , ans : "+e);
    }

}


