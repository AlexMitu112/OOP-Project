package modernlibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Book {
    String ISBN;
    String bookName;
    String bookAuthor;
    String bookLanguage;
    String shelfNumber;
    int bookQuantity;
    int totalQuantity;
    
    void setBookValues(String code, String name, String author, String language, String shelf, int copies){
        ISBN = code;
	bookName = name;
	bookAuthor = author;
	bookLanguage = language;
	shelfNumber = shelf;
	bookQuantity = copies;
    }
    
    
    String getISBN(){
        return ISBN;
    }
    String getName(){
        return bookName;
    }   
    String getAuthor(){
        return bookAuthor;
    }
    String getLanguage(){
        return bookLanguage;
    }
    String getShelf(){
        return shelfNumber;
    }
    int getQuantity(){
        return bookQuantity;
    }    
    
    void updateQuantity(){
        bookQuantity--;
    }
    
    void setTQuantity(int number){
        totalQuantity = number;
    }
    
    
    int totalQuanttiy(){
        return totalQuantity;        
    }
}