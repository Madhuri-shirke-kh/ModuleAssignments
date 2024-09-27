// Base class representing a generic Vehicle
class Vehicle {
  
    private String make;
    private int year;

    
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

   
    public String getMake() {
        return make;
    }

   
    public int getYear() {
        return year;
    }

   
    public String getVehicleDetails() {
        return "Make: " + make + ", Year: " + year;
    }
}


class Car extends Vehicle {
   
    private String model;

    
    public Car(String make, int year, String model) {
        super(make, year); // Call the constructor of the Vehicle class
        this.model = model;
    }

    
    public String getModel() {
        return model;
    }

    
    public String getCarDetails() {
        return getVehicleDetails() + ", Model: " + model;
    }
}

public class CarDemo {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 2022, "Corolla");

       
        System.out.println("Car Details: " + car.getCarDetails());
    }
}