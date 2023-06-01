public class Car {
    private String type;
    private String model;
    private int wheels;
    private double maxSpeed;
    private boolean lightsAreOn = false;

    public Car(String type, String model, int wheels, double maxSpeed) {
        this.type = type;
        this.model = model;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {return type;}
    public void setType(String iType) {this.type = iType;}
    public String getModel() { return model; }
    public void setModel(String modelName) { this.model = modelName; }
    public int getWheels() { return wheels; }
    public void setWheels(int wheelsCount) { this.wheels = wheelsCount;}
    public double getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(double maxSpeedNumber) { this.maxSpeed = maxSpeedNumber; }

    public String areLightsOn() { 
        if(lightsAreOn){
            return "Light is on.";
        }else{
            return "Light is off.";
        }
    }

    public void honk(){
        System.out.println("Beep");
    }

    public void switchLights(){
        this.lightsAreOn = !lightsAreOn;
    }

}   
