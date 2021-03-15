public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
//        StringBuilder printvalue = new StringBuilder();
        int no = getDigitCount(number);
        int rev = reverse(number);
        int revsersecount = rev;
        int reserveanswer = getDigitCount(revsersecount);
        while (rev != 0) {
            int a = rev % 10;
//            System.out.println(a);
            switch (a) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            rev = rev / 10;
        }
        if (no != reserveanswer) {
            int print = no - reserveanswer;
            while (print != 0) {
                System.out.println("Zero");
                print -= 1;
            }
        }
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0 ? true : false;
        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit
        }

        return isNegative == true? reverse*-1 : reverse;
    }



    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        else if (number == 0){
            return 1;
        }
        else{
            while (number != 0) {
                number = number / 10;
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(1);
//        numberToWords(-1);
//        int wow = reverse(-18);
//        System.out.println(wow);
//        int great = getDigitCount(0);
//        System.out.println(great);
////       int r = reverse(10);
////        System.out.println(r);
    }
}


