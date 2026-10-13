package Question;

public class Student {

    static int counter = 0;
    int rollNo;
    String name;

    public Student(String name) {
        counter++;
        this.rollNo = counter;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mauli");
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Amit");

        s1.display();
        s2.display();
        s3.display();
    }

}



