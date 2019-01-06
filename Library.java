import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Library {
	
	private ArrayList<Book> collection;
	private int totalPages;
	private double totalCost;
	private int totalBooks;

	// initializes an empty library
	public Library (){
		collection = new ArrayList<Book> ();
		totalPages = 0;
		totalCost = 0;
		totalBooks = 0;
	}

    // Adds a book to library     
    public void addBook(String title, String author, int length, 
    	String dateCompleted, double price){

    	Book toAdd = new Book(title, author, length, dateCompleted, price);

    	collection.add(toAdd);
    	totalPages = totalPages + toAdd.getlength();
    	totalCost = totalCost + toAdd.getPrice();
    	totalBooks = totalBooks + 1;
    }

    public void sort(){
    	Collections.sort(collection);
    	}

}
