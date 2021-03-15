public class Example {


        public static void main(String[] args) {
            numberToWords(123);
            numberToWords(1010);
            numberToWords(1000);
            numberToWords(-12);
        }

        public static void numberToWords(int number) {
            String numString = "";
            if (number < 0) {
                System.out.println("Invalid Value");
            }
            int numDigits = getDigitCount(number);
            int reverseNum = reverse(number);
            int testNum = 0;
            while (numDigits > 0) {
                testNum = reverseNum % 10;
                reverseNum /= 10;
                numDigits -= 1;
                if (testNum == 0) {
                    numString += "Zero ";
                } else {
                    switch (testNum) {
                        case 1:
                            numString += "One ";
                            break;
                        case 2:
                            numString += "Two ";
                            break;
                        case 3:
                            numString += "Three ";
                            break;
                        case 4:
                            numString += "Four ";
                            break;
                        case 5:
                            numString += "Five ";
                            break;
                        case 6:
                            numString += "Six ";
                            break;
                        case 7:
                            numString += "Seven ";
                            break;
                        case 8:
                            numString += "Eight ";
                            break;
                        case 9:
                            numString += "Nine";
                            break;
                    }
                }
            }
            System.out.println(numString);

        }

        public static int reverse(int number) {
            int reverseNum = 0;
            int digitCountSq = (int) Math.pow(10, getDigitCount(number) - 1);
            while (number > 0) {
                reverseNum += (number % 10) * (digitCountSq);
                number /= 10;
                digitCountSq /= 10;
            }
            return reverseNum;
        }

        public static int getDigitCount(int number) {
            int digit = 0;
            if (number < 0) {
                return -1;
            }
            if (number == 0) {
                digit = 1;
            }
            while (number > 0) {
                number /= 10;
                digit += 1;
            }
            return digit;
        }
    }

