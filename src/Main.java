//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car( "Toyota", "TLX", 2025);
        Car mySecondCar = new Car( "BMW", "Q3", 2025);

        myCar.accelerate();
        myCar.brake();
    }
}