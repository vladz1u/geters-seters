package Books;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> listBooks = new ArrayList<>();

    public Library(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public void addBook(String title, String author, int publicationYear) {
        Book book = new Book(title, author, publicationYear);
        listBooks.add(book);
    }

    public void removeBook(int i) {
        System.out.println("Books.Book behind the " + i + " index has been deleted");
        this.listBooks.remove(i);
    }

    public void printBooks(){
        for (Book book : listBooks) {
            System.out.println(book.toString());
        }
    }

    public void getBook(String nameBook) {
        for (Book book : listBooks){
            if (book.title == nameBook){
                System.out.println(book.toString());
            }
        }
    }

    public static void countBooks(ArrayList<Book> listBooks){
        int count = 0;
        for (Book book : listBooks){
            count ++;
        }
        System.out.println("In library are " + count + " books");
    }

}
