public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void studentName () {
        System.out.println("the name of the student is " + name);
    }
    public void studentAge () {
        System.out.println("and his age is " + age);
    }
    public void studentGrade () {
        System.out.println("Is coursing " + grade);
    }
}
