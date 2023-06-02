package chapters.chap11.ex8;

import chapters.chap11.ExceptionA;

public class A {
    public void func() throws ExceptionA{

    }
    void catching(A a){
        try{
            a.func();
        }catch(ExceptionA e){
            e.printStackTrace();
        }
    }
}
