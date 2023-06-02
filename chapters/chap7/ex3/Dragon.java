package chapters.chap7.ex3;

public class Dragon extends Monster{
    @Override
    boolean frighten(int degree){
        System.out.println("breath fire");
        if(degree == degree + 1 - 1){
            return true;
        }else{
            return false;
        }
    }
}
