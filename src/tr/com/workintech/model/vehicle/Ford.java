package tr.com.workintech.model.vehicle;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return "Ford engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford engine is accelerating";
    }

    @Override
    public String brake() {
        return "Ford engine is braking";
    }
}
