class Vehicle{
    double maxSpeed;
    String fuelType;

    Vehicle(double maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    void displayInfo(){
        System.out.println("speed: "+maxSpeed+" fuel type: "+fuelType);
    }
}

class Car extends Vehicle{

    int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        System.out.println("calling car constructor");
        this.seatCapacity=seatCapacity;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.print(" seat capacity: "+seatCapacity);
    }
}

class Truck extends Vehicle{

    int power;

    Truck(double maxSpeed, String fuelType, int power) {
        super(maxSpeed, fuelType);
        System.out.println("calling truck constructor");
        this.power=power;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.print(" power: "+power);
    }
    }

class Motorcycle extends Vehicle{

    double fuelTankCapacity;

    Motorcycle(double maxSpeed, String fuelType, double fuelTankCapacity) {
        super(maxSpeed, fuelType);
        System.out.println("calling motorcycle constructor");
        this.fuelTankCapacity=fuelTankCapacity;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.print(" fuel tank capacity: "+fuelTankCapacity);
    }
    }


public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle vehicle=new Motorcycle(60.0, "Petrol", 15.5);
        vehicle.displayInfo();
        System.out.println();

        Vehicle truck=new Truck(250, "Diesel" , 200);
        truck.displayInfo();
        System.out.println();

        Vehicle car=new Car(180.0, "Petrol", 5);
        car.displayInfo();
    }
}
