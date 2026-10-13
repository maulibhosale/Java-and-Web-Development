package Question;

public class Library {

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void display() {
        for (int i = 0; i < books.length; i++) {
            books[i].display();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James Gosling");
        Book b2 = new Book("Python", "Guido van Rossum");
        Book b3 = new Book("C Programming", "Dennis Ritchie");

        Book[] arr = {b1, b2, b3};

        Library l = new Library(arr);
        l.display();
    }

}