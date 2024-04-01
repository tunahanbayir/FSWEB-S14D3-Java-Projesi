package tr.com.workintech.model.company;

public class HybridCar extends CarSkeleton{
    public double avgKmPerLitre;
    public int batterySize;
    public int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return "HybridCar engine start ";
    }

    @Override
    public String drive() {
        return "HybridCar engine driving";
    }
}
