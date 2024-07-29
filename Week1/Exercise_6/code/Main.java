package Week1.Exercise_6.code;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Linear search
        Book foundBook = library.linearSearchByTitle("1984");
        System.out.println("Found Book: " + foundBook);
    }
}
