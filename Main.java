public class LibrarySystem {
public static void main(String[] args) {

Author author = new Author("William Shakespeare");  
    Book book = new Book("Romeo and Juliet", author);  
    Library library = new Library(book);  

    System.out.println(library.displayLibraryData());  
}

}