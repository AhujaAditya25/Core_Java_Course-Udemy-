public class Main {
    public static void main(String[] args) {
        AccountTranstions Aditya = new AccountTranstions("Aditya Ahuja");
        System.out.println("Acoount holders name is : "+Aditya.getAccountholder());
        Aditya.deposite(1500);
        Aditya.Printbalance();
        Aditya.withdrawl(1000);
        Aditya.Printbalance();
    }
}
