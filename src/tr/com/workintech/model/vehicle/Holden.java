package tr.com.workintech.model.vehicle;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Holden engine is starting";
    }

    @Override
    public String accelerate() {
        return "Holden engine is accelerating";
    }

    @Override
    public String brake() {
        return "Holden engine is braking";
    }
}
