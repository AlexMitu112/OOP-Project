package modernlibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadingData {   
    //Declare an array that stores all the books in the library
    Book[] books = new Book[10];
    File file = new File("Books.txt");
    
    //Read the data from the file and insert it in objects
    void Books() throws FileNotFoundException{
        int i =0;
        Scanner sc = new Scanner(file);
        String input;
	while(sc.hasNextLine()){
            input= sc.nextLine();
            String[] arr = input.split(",");
            Book b = new Book();
            int nr=Integer.parseInt(arr[5]);
            b.setBookValues(arr[0],arr[1],arr[2],arr[3],arr[4],nr);
            books[i]=b;
            i++;
        }
    }
    
    
    //Declare an array that stores all the users      
    Subscriber[] users = new Subscriber[2];
    File file2 = new File("Subscribers.txt"); 
    
    //Read the data from the file and insert it in objects
    void Subscribers() throws FileNotFoundException{
	int i =0;
        Scanner sc = new Scanner(file2);
        String input;
        
	while(sc.hasNextLine()){
            input= sc.nextLine();
            String[] arr = input.split(",");
            Subscriber b = new Subscriber();   
            b.setSubscriberValues(arr[0], arr[1], arr[2], arr[3]);
            users[i]=b;
            i++;
        }
        
        
    }    
    
    //Declare an array that stores all the rooms available in the library
    Room[] rooms = new Room[500];
    File file3 = new File("Rooms.txt"); 
    
    //Read the data from the file and insert it in objects
    void Rooms() throws FileNotFoundException{
	int i =0;
        Scanner sc = new Scanner(file3);
        String input;
	while(sc.hasNextLine()){
            input= sc.nextLine();
            String[] arr = input.split(",");
            Room b = new Room();  
            b.setRoomValues(arr[0], arr[1], arr[2]);
            rooms[i]=b;
            i++;
	}
    }    
    
    //Declare an array for the books that were borrowed
    Borrow[] res= new Borrow[500];
    
}
