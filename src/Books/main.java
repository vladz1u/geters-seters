package Books;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Library library = new Library(new ArrayList<>());
        library.addBook("Война и мир", "Лев Толстой", 1869);
        library.addBook("hjhhj", "Лев Толстой", 1869);
        library.addBook("sssss", "Лев Толстой", 1869);
        library.addBook("1234", "Лев Толстой", 1869);
        Library.countBooks(library.listBooks);
    }
}
