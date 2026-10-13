package Question;

public class Book {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void display() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }

}