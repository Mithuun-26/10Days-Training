package BASICS;
interface Engine {
    void start();
}
interface Tyre {
    void roll();
}
class CarEngine implements Engine {
    public void start() { 
    	System.out.println("Car engine starts"); 
    	}
}
class CarTyre implements Tyre {
    public void roll() { 
    	System.out.println("Car tyre rolls"); 
    	}
}
class TruckEngine implements Engine {
    public void start() { 
    	System.out.println("Truck engine starts"); 
    	}
}
class TruckTyre implements Tyre {
    public void roll() { System.out.println("Truck tyre rolls"); }
}
interface VehicleFactory {
    Engine createEngine();
    Tyre createTyre();
}
class CarFactory implements VehicleFactory {
    public Engine createEngine() { return new CarEngine(); }
    public Tyre createTyre() { return new CarTyre(); }
}
class TruckFactory implements VehicleFactory {
    public Engine createEngine() { return new TruckEngine(); }
    public Tyre createTyre() { return new TruckTyre(); }
}
public class Task1Ab {
    public static void main(String[] args) {
        String type = "CAR";  
        VehicleFactory factory;
        if (type.equals("CAR"))
            factory = new CarFactory();
        else
            factory = new TruckFactory();
        Engine e = factory.createEngine();
        Tyre t = factory.createTyre();
        e.start();
        t.roll();
    }
}
