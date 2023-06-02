package chapters.chap13.ex3;

public class Main {
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int n: array) sum += n;
        return sum;
    }
    public static double sumArray(double[] array) {
        double sum = 0;
        for(double n: array) sum += n;
        return sum;
    }
    public static float sumArray(float[] array) {
        float sum = 0;
        for(float n: array) sum += n;
        return sum;
    }
    public static String sumArray(String[] array) {
        String result = ""; 
        for(String n: array)result+=n;
        return result;
    }
    public static void main(String[] args){
        int[] intArr= {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        double[] doubleArr= {1,2,3.5,4,5,6.9999999999999};
        float[] floatArr = {1,2,3,4,5,(float) 6.3434};
        String[] stringArr = {"hello", "world", "my", "name", "is", "..."};
        System.out.println(sumArray(intArr));
        System.out.println(sumArray(doubleArr));
        System.out.println(sumArray(floatArr));
        System.out.println(sumArray(stringArr));
    }
}
