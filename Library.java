public class Library {
private Book book;

public Library(Book book) {  
    this.book = book;  
}  

public String displayLibraryData() {  
    return book.getBookInfo();  
}  

public void identify() {  
    System.out.print("This class manages books inside the library. ");  
}

}