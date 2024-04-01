package tr.com.workintech.model.company;

public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("Generic Car", "loerupsum");
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());

        ElectricCar electricCar = new ElectricCar("Generic Car", "loerupsum", 300, 5);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Generic Car", "loerupsum", 300, 5);
        System.out.println(gasPoweredCar.startEngine());
        System.out.println(gasPoweredCar.drive());
    }

}
