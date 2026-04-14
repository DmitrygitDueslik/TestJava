public class main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        
        books[0] = new Book(1, "Java", "Ekkel", 310);
        books[1] = new Book(2, "C++", "Straustrup", 300);
        books[2] = new Book(3, "Asm", "Pinsler", 300);
        
        Book found = find(books, new Book(1, "Java", "Ekkel", 310));
        print(found);
    }

    public static Book find(Book[] mas, Book b) {
        for (Book obj : mas) {
            if (obj == null) {
                continue;
            }
            if (!obj.getTitle().equals(b.getTitle())) {
                continue;
            }
            if (obj.getPrice() != b.getPrice()) {
                continue;
            }
            return obj; 
        }
        return null;
    }

    public static void print(Book b) {
        if (b != null) {
            System.out.println(" Найдена книга: " + b);
        } else {
            System.out.println(" Книга не найдена в массиве.");
    }
}
}