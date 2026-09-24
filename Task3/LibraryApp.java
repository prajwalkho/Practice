
package Task3;

import java.util.ArrayList;

class Book {

    private int bookId;
    private String title;
    private String author;
    private double price;

    public Book(int bookId, String title, String author, double price) {
        setBookId(bookId);
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        if (bookId > 0) {
            this.bookId = bookId;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId
                + ", Title: " + title
                + ", Author: " + author
                + ", Price: ₹" + price;
    }
}

public class LibraryApp {

    public static void main(String[] args) {

        ArrayList<Book> javaBooks = new ArrayList<>();

        javaBooks.add(
                new Book(1, "Java Basics", "James", 500)
        );

        javaBooks.add(
                new Book(2, "Advanced Java", "John", 700)
        );

        javaBooks.add(
                new Book(3, "Spring Boot", "Mark", 800)
        );

        ArrayList<Book> pythonBooks = new ArrayList<>();

        pythonBooks.add(
                new Book(4, "Python Intro", "Guido", 400)
        );

        pythonBooks.add(
                new Book(5, "Python ML", "Andrew", 900)
        );

        pythonBooks.add(
                new Book(6, "Python AI", "Sara", 1000)
        );

        ArrayList<Book> webBooks = new ArrayList<>();

        webBooks.add(
                new Book(7, "HTML & CSS", "Tim", 300)
        );

        webBooks.add(
                new Book(8, "JavaScript", "Brendan", 600)
        );

        webBooks.add(
                new Book(9, "ReactJS", "Dan", 750)
        );

        ArrayList<ArrayList<Book>> library = new ArrayList<>();

        library.add(javaBooks);
        library.add(pythonBooks);
        library.add(webBooks);

        String[] sectionNames = {
                "Java",
                "Python",
                "Web Development"
        };

        System.out.println("===== LIBRARY BOOKS =====");

        for (int i = 0; i < library.size(); i++) {

            System.out.println("\n" + sectionNames[i] + " Section:");

            ArrayList<Book> books = library.get(i);

            for (Book book : books) {
                System.out.println(book);
            }

            System.out.println(
                    "Number of Books: " + books.size()
            );
        }

        System.out.println("\n===== JAVA SECTION =====");

        ArrayList<Book> javaSection = library.get(0);

        for (Book book : javaSection) {
            System.out.println(book);
        }

        System.out.println(
                "\nTotal Number of Sections: " + library.size()
        );
    }
}

