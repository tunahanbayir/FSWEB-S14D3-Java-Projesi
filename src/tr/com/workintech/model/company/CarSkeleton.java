package tr.com.workintech.model.company;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        runEngine();
        return "CarSkeleton engine is start";
    }
    public String drive(){
        return "CarSkeleton is driving";
    }
    protected void runEngine(){
        System.out.println("CarSkeleton engine is running");
    }
}
