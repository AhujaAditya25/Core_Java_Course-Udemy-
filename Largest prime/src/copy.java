public class copy {
    public static int largestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;


        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;
    }


    public static void main(String[] args) {
        int a =largestPrimeFactor(1);
        System.out.println(a);
    }
}
