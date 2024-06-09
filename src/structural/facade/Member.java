package structural.facade;



public class Member {

    private String name;
    private BooksCatalog booksCatalog;

    public Member(String name) {
        this.name = name;
        booksCatalog = new BooksCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addToBorrowedBooks(Book book){
        booksCatalog.addBook(book);
    }
    public void returnBorrowedBook(Book book){
        booksCatalog.removeBooks(book);
    }

    @Override
    public String toString(){
        return  "Member name - " + this.name +"\n" + booksCatalog.toString();
    }

    public BooksCatalog getBooksCatalog() {
        return booksCatalog;
    }

    public void setBooksCatalog(BooksCatalog booksCatalog) {
        this.booksCatalog = booksCatalog;
    }
}
