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

    	collection.add(new Book(title, author, length, dateCompleted, price));
    	totalPages = totalPages + length;
    	totalCost = totalCost + price;
    	totalBooks = totalBooks + 1;
    }

    public void sort(){
    	// find out how user would like to sort the library
    	Scanner input = new Scanner(System.in);
    	System.out.println("How would you like to sort the library?\n");
    	method = input.nextLine(); // method refers to how player sorts library

    	if (method.equals("title")){
    		// sort alphabetically by title
    	}

    	else if (method.equals("author")){
    		// sort alphabetically by author's last name
    	}

    	else if (method.equals("length")){
    		// sort alphabetically by length (shortest-longest)
    	}

    	else if (method.equals("date")){
    		// sort by date completed
    	}

    	else if (method.equals("price")){
    		// sort by price (ask high to low)
    		System.out.println("Please enter what prices you would "+
    			"like to appear first (low OR high)");
    	}

    	else{
    		System.out.println("Please enter a valid sorting device.\n"
    			+ "Valid sort methods are: \nTitle, Author, "
    			+ "Length, Date, and Price");
    	}
    }


}
