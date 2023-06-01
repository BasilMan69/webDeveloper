package chapters.chap3.ex2.b;

public class DVDPlayerTestDrive {
    public static void main(String[] args){
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        if (d.canRecord){
            d.recordDVD();
        }
    }
}
