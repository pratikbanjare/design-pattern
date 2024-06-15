package structural.facade;

public class FacadeMain {

    public static void main(String[] args){

        LibraryService libraryService = new LibraryService(new BooksService(), new MemberService());

        libraryService.listAllBooksInLibrary();
        libraryService.borrowBooks("Java","Pratik");
        libraryService.listAllBooksInLibrary();

        libraryService.listAllMembersOfLibrary();

    }
}
