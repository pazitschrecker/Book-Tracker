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
