package chapters.chap3.ex2.a;

public class SoundDeckTestDrive {
    public static void main(String[] args){
        SoundDeck t = new SoundDeck(); //fix
        t.canRecord = true;
        t.play();
        if(t.canRecord){
            t.record();
        }
    }
}
