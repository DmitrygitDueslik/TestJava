import java.util.*;


class Book implements Cloneable, Comparable<Book> {
    private int id;
    private String title;
    private String author;
    private int price;

    public Book(int id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается");
        }
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.price, other.price);
    }

    
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPrice() { return price; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s', price=%d}", 
                           id, title, author, price);
    }
}

class BookFactory {
    public static Book createJavaBook() {
        return new Book(1, "Java", "Ekkel", 310);
    }
    
    public static Book createCppBook() {
        return new Book(2, "C++", "Stroustrup", 300);
    }
}

class BookByTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}

class BookByAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 19-1: Cloneable, Factory, Comparable, Comparator \n");
        
        Book b1 = BookFactory.createJavaBook();
        Book b2 = BookFactory.createCppBook();
        
        Book b1Copy = b1.clone();
        System.out.println("1. Клонирование:");
        System.out.println("   Оригинал: " + b1);
        System.out.println("   Копия:    " + b1Copy);
        System.out.println("   Это один объект? " + (b1 == b1Copy) + " (должно быть false)\n");
        
        List<Book> books = new ArrayList<>(Arrays.asList(b1, b2));
        
        Collections.sort(books);
        System.out.println("2. Сортировка по цене (Comparable - естественный порядок):");
        for (Book b : books) {
            System.out.println("   " + b);
        }
        
        books.sort(new BookByTitleComparator());
        System.out.println("\n3. Сортировка по названию (Comparator - внешний класс):");
        for (Book b : books) {
            System.out.println("   " + b);
        }
        
        books.sort(Comparator.comparing(Book::getAuthor));
        System.out.println("\n4. Сортировка по автору (Comparator + лямбда):");
        for (Book b : books) {
            System.out.println("   " + b);
        }
        
        books.sort(Comparator.comparingInt(Book::getPrice).reversed());
        System.out.println("\n5. Сортировка по цене (по убыванию, лямбда):");
        for (Book b : books) {
            System.out.println("   " + b);
        }
    }
}