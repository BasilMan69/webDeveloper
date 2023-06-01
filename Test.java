import java.util.Scanner;

public class Test{
    public static void printPrimeNumbers(int num){
        System.out.println("Prime numbers:");
        for(int i=2; i<=num; i++){
            if(i == 2 || i == 3){
                System.out.println(i);
            }
            else{
                boolean notPrime = false;
                for(int j=2; j<i/2 + 1; j++){
                    if(i%j==0){
                        notPrime = true;
                        break;
                    }
                }
                if(!notPrime){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int num = input.nextInt();
        input.close();
        printPrimeNumbers(num);
        
        System.out.println("Im also here to create conflict");
        
        System.out.println("Bye bye world");
        
    }
}