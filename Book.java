/* To create: 
1. sort methods by all input variables 
2. output in table
3. count total pages read
4. sort by most popular author
*/ 

import java.util.Scanner;

public class Book {
	
	private String title;
	private String author;
	private int length;
	private String dateCompleted;
	private double price;

	public Book(String t, String a, int l, String d, double p){
		title = t;
		author = a;
		length = l;
		dateCompleted = d;
		price = p;
	}


	// use this method to compare books so they may be easily sorted
	public int compareTo(Book other){
		Scanner input = new Scanner(System.in);
    	System.out.println("How would you like to sort the library?\n");
    	method = input.nextLine(); // method refers to how player sorts library

    	if (method.equals("title") || method.equals("Title") || method.equals("TITLE")){
    		return other.title.compareTo(this.title);
    	}

    	else if (method.equals("author") || method.equals("Author") || method.equals("AUTHOR")){
    		return other.author.compareTo(this.author);
    	}

    	else if (method.equals("length") || method.equals("Length") || method.equals("LENGTH")){
    		return other.length.compareTo(this.length);
    	}

    	else if (method.equals("date") || method.equals("Date") || method.equals("DATE")){
    		return other.dateCompleted.compareTo(this.dateCompleted);
    	}

    	else if (method.equals("price") || method.equals("Price") || method.equals("PRICE")){
    		return other.price.compareTo(this.price);
    	}

    	else{
    		System.out.println("Please enter a valid sorting technique:\n"
    			+ "title, author, length, date, or price");
    	}
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return title;
	}

	public int getLength(){
		return length;
	}

	public String getDate(){
		return dateCompleted;
	}

}
