package chapters;
public class Chap2 {
    public static void b4(){
        //a
        int x = 9;
        int y = 10;
        int z = x++ + y ;
        System.out.println(x + " " + y + " " + z);
        //b
        int count = 11;
        if(count > 10)
            System.out.println("Count is greater than 10");
        //c
        int total = 5;
        total -= x--;
        System.out.println(total + " "+ x);
        //d
        int q = 10;
        int d = 3;
        q %= d;
        System.out.println(q + " " +d);
        //e
        int sum = 0;
        x = 10;
        //f
        sum += x;
        //g
        System.out.println("The sum is " + sum);
        //h
        sum=0;
        for(int i = 1; i < 99; i+=2){
            if(i%2!=0){
                i++;
            }else{
                sum += i;
            }
        }
        System.out.println("The sum is " + sum);
        //i
        for(int i=1; i<= 10; i++)
            System.out.print(i + "\t");
        
    }

    
    public static void b5(){
        int i=1;
        int sum=0;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
    public static void b6(){
        int sum = 0;
        for(int i=1; i<= 10; i++)
            sum+=i;
        System.out.println(sum);
    }
    public static void b7(){
        int i=1;
        int sum=0;
        do{
            sum+=i;
            i++;
        }while(i<=10);
        System.out.println(sum);
    }  
    public static void b8(){
        /*
        13
        14
        15
        x = 7
         */
    }  
    public static void b9(){
        /*
        class MultiFor{
            public static void main(String [] args){
                for(int x=0; i<4;x++){
                    for(int y=4; y>2; y--){
                        System.out.println(x + " " + y);
                        if(x==1){
                            x++;
                        }
                        
                    }
                }
            }       

        }
        */
    }  
    public static void b10(){
        System.out.printf("Hello, I am %s, I am %d years old.\n", "khoi", 17);
    }  
   
    public static void main(String[] args){
        b5();
        b6();
        b7();
        b10();
    }
}
