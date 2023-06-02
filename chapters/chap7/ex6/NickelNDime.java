package chapters.chap7.ex6;

public class NickelNDime extends Account {
    public NickelNDime(int balance) {
        super(balance);
    }
    @Override
    protected int endMonthCharge(){
        return transactions*2000;
    }
}
