public class PlayingCat {

    public static void main(String[] args) {
       boolean a = isPlaying(true,30);
        System.out.println(a);
        boolean b= isPlaying(false,10);
        System.out.println(b);
    }

    public static boolean isPlaying(boolean summer ,int Temperature ){
        if ((summer== true) && (Temperature>= 25 && Temperature<=45)){
            return true;
        }
        else if ((summer==false) &&(Temperature>=25 && Temperature <=35)){
            return true;
        }
        else return false;

    }
}
