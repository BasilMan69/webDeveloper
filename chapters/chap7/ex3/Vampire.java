package chapters.chap7.ex3;

public class Vampire extends Monster {
    @Override
    boolean frighten(int degree){
        System.out.println("arrrgh");
        return degree > 1;
    }
}
