package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
    
    private static boolean isLirarycatalogInitialized = false;
    private static boolean isMembersInitialized = false;

    
    private static BooksCatalog booksCatalog;
    private static MemberRegistry memberRegistry;

    public static BooksCatalog getLibrarybooksCatalog() {
        if (!isLirarycatalogInitialized){
            booksCatalog = new BooksCatalog();
            List<Book> books = new ArrayList<>();
            books.add(new Book("Java",BookStatus.LIBRARY));
            books.add(new Book("Cpp",BookStatus.LIBRARY));
            books.add(new Book("Python",BookStatus.LIBRARY));
            books.add(new Book("Scala",BookStatus.BORROWED));
            booksCatalog.addAllBooks(books);
            isLirarycatalogInitialized = true;
        }
        return booksCatalog;
    }

    public static MemberRegistry getMemberRegistry () {
        if (!isMembersInitialized){
            memberRegistry = new MemberRegistry();
            List<Member> members = new ArrayList<>();
            members.add(new Member("Pratik"));
            members.add(new Member("Adi"));
            members.add(new Member("Rupesh"));
            members.add(new Member("Priyang"));
            memberRegistry.addAllMembers(members);
        }
        return memberRegistry;
    }
}
