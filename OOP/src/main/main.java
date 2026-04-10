package main;

import com.training.exproject.entity.Book;

public class main {
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2 = new Book(); 
		b1.title = "Java"; 
		b1.author = "Gosling"; 
		b1.yearPublished = 1998; 
		b1.price = 300; 
		System.out.println("title - " + b1.title); 
		System.out.println("author - " + b1.author); 
		System.out.println("yearPublished - " + b1.yearPublished); 
		System.out.println("price - " + b1.price); 
	}
}
