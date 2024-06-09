package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {

    private final List<Book> books;

    public BooksCatalog() {
        books = new ArrayList<>();
    }

    public Book findBookByName(String name){
        return books.stream()
                .filter(book -> name.equalsIgnoreCase(book.getName()))
                .findFirst().orElse(null);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBooks(Book book){
        books.remove(book);
    }

    public void addAllBooks(List<Book> books){
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString (){
        StringBuilder builder = new StringBuilder();
        for (Book book : books){
            builder.append("\t").append(book.toString()).append("\n");
        }
        return builder.toString();
    }
}
