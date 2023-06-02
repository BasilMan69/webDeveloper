package chapters.chap8.ex9;

public class Addition implements BinaryExpression {
    private Expression left;
    private Expression right;
    public Expression left(){
        return left;
    }
    public Expression right(){
        return right;
    }
    public void evaluate(){
        
    }
    public String toString() {
        return left + " + " + right;
    }
}
