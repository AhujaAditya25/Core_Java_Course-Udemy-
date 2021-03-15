public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <=1) {
            return -1;
        } else {
            int greatestprime = 0;
            for (int i = 2; i < number; i++) {
                if ((number % i == 0 && number % 2 !=0) ) {
                    if (i > greatestprime) {
                        greatestprime = i;
                    }
                }
                if (greatestprime == 0){
                    if (number / 2 == 1 && number % 2 == 0) {
                        return 2;
                    }
                    if (number / 3 == 1 && number % 3 == 0) {
                        return 3;
                    }
                    if (number / 5 == 1 && number % 5 == 0) {
                        return 5;
                    }
                    if (number / 7 == 1 && number % 7 == 0) {
                        return 7;
                    }
                }


            }
            if (greatestprime == 0){
                greatestprime = -1;
            }
            return greatestprime;
        }
    }

        public static void main (String[]args){
            int a = getLargestPrime(31);
            System.out.println(a);
        }
    }


