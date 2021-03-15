public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit (int number){
        int sum = 0 ;

        sum = number % 10;

        while (number>=10){
            number = number /10 ;
            continue;
        }
        sum += number ;
        if (sum > 0){
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = sumFirstAndLastDigit(5);
        System.out.println(a);
    }

}
