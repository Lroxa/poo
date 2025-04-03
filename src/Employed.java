public class Employed {
    String employedName;
    String position;
    int salary;

    public Employed(String employedName, String position, int salary) {
        this.employedName = employedName;
        this.position = position;
        this.salary = salary;
    }
    public void state () {
        System.out.println("The employed " + employedName + " is working as " + position + " and his salary is " + salary);
    }
}
