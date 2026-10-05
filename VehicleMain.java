// 2. Vehicle and Car Override
class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.drive();
    }
}
