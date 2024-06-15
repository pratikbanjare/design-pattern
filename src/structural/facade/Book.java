package structural.facade;

public class Book {

    private String name;
    private BookStatus status;

    public Book(String name, BookStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Name - " + this.name + ", Status - " + this.status;
    }
}
