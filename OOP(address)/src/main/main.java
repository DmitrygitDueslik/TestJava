package main;
import com.training.exproject.entity.Book;
public class main {
	public static void main(String[] args) {
		Book b1=new Book();
		init(b1);
		System.out.println("title - " + b1.title); 
		System.out.println("author - " + b1.author); 
		System.out.println("yearPublished - " + b1.yearPublished); 
		System.out.println("price - " + b1.price); 
	}
	public static void init(Book b) { 
		b.title = "Java"; 
		b.author = "Gosling"; 
		b.yearPublished = 1998; 
		b.price = 300;   
		} 
}
