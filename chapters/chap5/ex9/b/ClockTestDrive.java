package chapters.chap5.ex9.b;

public class ClockTestDrive {
    public static void main(String[] args){
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
