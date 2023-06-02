#1
public SonOfBoo(String a, String b, String c){
    super(a, b); => super(a) || super(b)
}
#2
public SonOfBoo(int i, int x, int y){
    super(i, "boo"); => super("boo", i);
}