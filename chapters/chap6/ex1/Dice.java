package chapters.chap6.ex1;

public class Dice {
    int diceFace; //1 <= diceFace <= 6
    public void roll(){
        diceFace = (int)(Math.random()*6+1);
    }
}
