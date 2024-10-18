package PersonStudent.Book;

public class Textbook extends Book{
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Textbook() {
        super();
        subject = "";
    }

    public Textbook(String title, int year, double price, String subject) {
        super(title, year, price);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("subject : " + subject);
    }

}
