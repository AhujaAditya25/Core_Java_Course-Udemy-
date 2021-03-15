import java.util.ArrayList;

public class AccountTranstions {
    private int balance=0;
    private String accountholder;
    private ArrayList<Integer>transcations = new ArrayList<>();

    public AccountTranstions(String accountholder) {
        this.accountholder = accountholder;
    }

//    public int getBalance() {
//        return balance;
//    }

    public String getAccountholder() {
        return accountholder;
    }

    public void deposite(int amount){
        if (amount>0){
            transcations.add(amount);
            this.balance+=amount;
            System.out.println(amount+" is added and the current balance stands at Rs. "+this.balance);
        }else
        System.out.println("The operation could nt be performed. Sorry!");
    }

    public void withdrawl(int amount){
        if (balance>=amount) {
            int withdawlamount = -amount;
            this.balance+=withdawlamount;
            transcations.add(withdawlamount);
            System.out.println(amount+" deducted . Current balance stands at Rs."+this.balance);
        }
        else System.out.println("Cannot deduct the amount asked from the balance. Operation FAILED. ");
    }

    public void Printbalance(){
        this.balance=0;
        for (int i :transcations){
            this.balance+=i;
        }
        System.out.println("Balance calculated is Rs."+this.balance);
    }
}
