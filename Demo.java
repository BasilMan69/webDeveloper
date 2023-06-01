public class Demo {
    
    public static void main(String[] args) {
        System.out.println("Starting Demo");
        System.out.println("This is a demo");

        Car tr1 = new Truck("Ford F150", 4, 170.8);
        tr1.honk();
        tr1.switchLights();
        System.out.println(tr1.areLightsOn());
        System.out.println("Ending demo");
        
    }
}
