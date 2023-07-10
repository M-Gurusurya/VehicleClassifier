class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle started");
    }
    public void stop()
    {
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car started");
    }
    @Override
    public void stop()
    {
        System.out.println("Car stopped");
    }
}
class Motorcycle extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Motorcycle started");
    }
    @Override
    public void stop()
    {
        System.out.println("Motorcycle stopped");
    }
}
public class VehicleClassifier {
    public static void main(String[] args) {
        //Vehicle class
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.stop();
        //Car class
        Car car=new Car();
        car.start();
        car.stop();
        //Motorcycle class
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}
