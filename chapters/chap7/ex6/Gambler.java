package chapters.chap7.ex6;

public class Gambler extends Account{
    public Gambler(int balance) {
        super(balance);
    }
    @Override
    public boolean withdraw(int amount) {
        boolean gamblingSuccess = (int)(Math.random() * 100 + 1) <= 49;
        if(!gamblingSuccess){
            return true;
        }else{
            return super.withdraw(amount*2);
        }
    }
}
