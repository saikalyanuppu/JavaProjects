package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 400));
        books.add(new Book("Data Structures", 350));
        books.add(new Book("Algorithms", 500));

        Collections.sort(books);

        System.out.println("Sorted list of books by page count:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
