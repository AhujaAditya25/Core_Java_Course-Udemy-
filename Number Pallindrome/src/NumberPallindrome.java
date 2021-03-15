public class NumberPallindrome {

    public static boolean isPalindrome (int number){
            int reversenumber = 0 ;
        int original = number;
            while (original!=0) {
                int remainder = original % 10;
                reversenumber = reversenumber * 10 + remainder;
                original = original / 10;
//                System.out.println(reversenumber);
            }
            if (reversenumber == number){
                return true;
            }
            return  false;

    }

    public static void main(String[] args) {
        boolean as = isPalindrome(11);
        System.out.println(as);
        boolean aa = isPalindrome(1001);
        System.out.println(aa);
    }



}
