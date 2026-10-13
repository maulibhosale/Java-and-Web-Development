package Question;

public class Employee extends Person {

    public Employee() {
        super();
        System.out.println("Employee created");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }

}