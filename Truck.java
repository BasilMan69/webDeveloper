public class Truck extends Car {
    public Truck(String model, int wheels, double maxSpeed){
        super("Truck", model, wheels, maxSpeed);
    }

    @Override
    public void honk(){
        System.out.println("BEEEEEEEEEP!");
    }
    
}   
