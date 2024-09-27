class Vehicle {
   
    private String vehicleType;

    
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

   
    public String getVehicleType() {
        return vehicleType;
    }

   
    public void startEngine() {
        System.out.println("Starting engine of " + vehicleType);
    }

    
    public void stopEngine() {
        System.out.println("Stopping engine of " + vehicleType);
    }
}


class Car extends Vehicle {


    public Car() {
        super("Car");
    }


    public void startEngine() {
        System.out.println("Car engine is starting with a roar!");
    }



    public void stopEngine() {
        System.out.println("Car engine is stopping smoothly.");
    }
}


class Motorcycle extends Vehicle {

    public Motorcycle() {
        super("Motorcycle");
    }


    public void startEngine() {
        System.out.println("Motorcycle engine is starting with a vroom!");
    }



    public void stopEngine() {
        System.out.println("Motorcycle engine is stopping abruptly.");
    }
}


public class VehicleDemo {
    public static void main(String[] args) {
       
        Car car = new Car();
       
        System.out.println("Car operations:");
        car.startEngine();
        car.stopEngine();

       
        Motorcycle motorcycle = new Motorcycle();
       
        System.out.println("\nMotorcycle operations:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}