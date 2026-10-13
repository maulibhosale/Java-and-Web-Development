package Question;

public class Document implements Printable {

    String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }

    public static void main(String[] args) {
        Document d = new Document("This is a Java document");
        d.print();
    }

}
