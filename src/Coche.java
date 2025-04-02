public class Car {
    String brand;
    String model;
    int year;

    public Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void accelerate() {
        System.out.println("The car is accelerating");
    }
    public void brake() {
        System.out.println("The car is braking");
    }
}
