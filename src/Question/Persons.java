package Question;

public class Persons {

    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
        else {
            System.out.println("Invalid email");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Persons p = new Persons();

        p.setName("Mauli");
        p.setAge(20);
        p.setEmail("mauli@gmail.com");

        p.display();
    }

}
