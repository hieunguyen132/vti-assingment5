package vti.edu.vtiacademy.vtiassignment5.model.solid.liskov;

public class CarDriver {
    public void drive(Car car){
        car.drive();
        car.drift();
    }

    public static void main(String[] args) {
        var garage= new Garage();
        garage.park(new Car());
        garage.park(new Truck());

    }
}
