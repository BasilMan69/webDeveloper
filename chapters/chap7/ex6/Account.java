package chapters.chap7.ex6;

public class Account {
    protected int balance;
    protected int transactions;
    public Account(int balance){
        this.balance = balance;
    }
    public boolean deposit(int amount){
        balance += amount;
        transactions++;
        return true;
    }
    public boolean withdraw(int amount){
        if(balance - amount < 0){
            return false;
        }
        balance -= amount;
        transactions++;
        return true;
    }
    public void endMonth(){
        if(!withdraw(endMonthCharge())){
            balance = 0;
            System.out.println("Not enough funds to pay for end month charge");
        }
        System.out.println("Balance: " + balance +"\nTransactions: " + transactions +"\nEnd Month Charge: " + endMonthCharge());
        transactions = 0;
    }
    protected int endMonthCharge(){
        return 0;
    }
}
