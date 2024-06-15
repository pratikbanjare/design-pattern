package structural.facade;

public class LibraryService {


    private final BooksService booksService;
    private final MemberService memberService;

    public LibraryService(BooksService booksService, MemberService memberService) {
        this.booksService = booksService;
        this.memberService = memberService;
    }

    public void borrowBooks(String bookName, String memberName){
        // check if member exist in catalog or not ?
        // Check if book exist in catalog or not ?
        // if book exist and member is listed, allow boorow of books

        Book book = booksService.findBookInLibraryCatalog(bookName);
        Member member = memberService.findMemberByName(memberName);

        if (null != book && member !=null){
            switch (book.getStatus()){
                case LIBRARY: {
                    System.out.println("Book is prenset in library");
                    book.setStatus(BookStatus.BORROWED);
                    member.addToBorrowedBooks(book);
                    break;
                }
                case BORROWED: {
                    System.out.println("Book is being borrowed by other member");
                    break;
                }
                default:{
                    System.out.println("Status of Book is unknown");
                }
            }
        } else {
            System.out.println("Book is not avaialbe at library");
        }

    }

    public void returnBook(String bookName, String memberName){
        // check if member exist in catalog or not ?
        // Check if book exist in catalog or not ?
        // if book exist and member is listed, allow return of books

        Book book = booksService.findBookInLibraryCatalog(bookName);
        Member member = memberService.findMemberByName(memberName);

        if (null!=book && member != null ){
            book.setStatus(BookStatus.LIBRARY);
            member.returnBorrowedBook(book);
        }
    }

    public void listAllBooksInLibrary(){
        System.out.println("List of books in library and thier status ");
        booksService.listAllBooks().forEach(book -> System.out.println(book.toString()));
    }

    public void listAllMembersOfLibrary () {
        System.out.println("List of Members of of library are - ");
        memberService.listAllMembers().forEach(member -> System.out.println(member.toString()));

    }

    public void addmember(String memberName){
        // add new member to member catalog, if not an existing member

    }

    public void removeMember(String memberName){
        // remove a member from member list, if  existing member
    }


}
