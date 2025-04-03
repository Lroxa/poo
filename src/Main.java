//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car( "Toyota", "TLX", 2025);
        Car mySecondCar = new Car( "BMW", "Q3", 2025);

        Book myBook = new Book(" El club de las 5:00am", " Laura", 96);

        Student studentProfile = new Student("Nico", 8, "4ª");

        BankAccount dates = new BankAccount(965823654, 40000, "Laura Amaya");

        Employed employedState = new Employed( "Laura Amaya", "Web developer", 9000000);

        employedState.state();

        dates.depositing();
        dates.withdraw();

        studentProfile.studentName();
        studentProfile.studentAge();
        studentProfile.studentGrade();

        myBook.reading();
        myBook.writer();
        myBook.length();

        myCar.accelerate();
        myCar.brake();
        mySecondCar.accelerate();
    }

}