public class Book {
private String title;
private Author author;

public Book(String title, Author author) {  
    this.title = title;  
    this.author = author;  
}  

public String getBookInfo() {  
    return "Book Title: " + title + ", Author: " + author.getName();  
}  

public void identify() {  
    System.out.print("This class stores book information in the system. ");  
}

}