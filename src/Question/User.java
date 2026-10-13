package Question;

public class User {

    String username;
    String email;

    public User(String username, String email) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        this.username = username;
        this.email = email;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        User u = new User("Mauli", "mauli@gmail.com");
        u.display();
    }

}

