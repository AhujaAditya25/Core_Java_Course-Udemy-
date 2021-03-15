public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1 , int num2 , int num3){
        if ( (num1>9 && num1<=1000) && (num2>9 && num2<=1000) && (num3>9 && num3<=1000) ){
            int a = num1 % 10;
            int b = num2 % 10;
            int c = num3 % 10;
            if (a==b || a==c){
                return true;
            }
            else if (b==c){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int numb){
        if (numb>9 && numb <= 1000){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean a = hasSameLastDigit(11,10,1000);
        System.out.println(a);
    }

}
