package tr.com.workintech.model.company;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return "GasPowered engine start";
    }

    @Override
    public String drive() {
        return "GasPowered engine driving";
    }
}
