package structural.facade;

import java.util.List;

public class BooksService {

    public Book findBookInLibraryCatalog(String name){

        BooksCatalog booksCatalog = Initializer.getLibrarybooksCatalog();
        return  booksCatalog.findBookByName(name);
    }

    public List<Book> listAllBooks(){
        return Initializer.getLibrarybooksCatalog().getBooks();

    }
}
