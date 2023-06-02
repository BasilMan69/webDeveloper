package chapters.chap7.ex6;

public class NormalAccount extends Account{
    public NormalAccount(int balance) {
        super(balance);
    }
    @Override
    protected int endMonthCharge(){
        return 10000;
    }
}
