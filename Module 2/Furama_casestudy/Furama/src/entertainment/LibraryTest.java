package entertainment;

public class LibraryTest {

    public static void main(String[] args) {
        Library<Book> bookList = new Library<Book>();
        Book book1 = new Book("qwe", 50, "1233");
        bookList.addElement(book1);
        Book book2 = new Book("abc", 100, "oqp");
        bookList.addElement(book2);
        Book book3 = new Book("987", 100, "456");
        bookList.addElement(book3);

        for (Book bok : bookList.librarys) {
            System.out.println(bok);
        }
        System.out.println("------");
        bookList.removeElement(book2);
        for (Book bok : bookList.librarys) {
            System.out.println(bok);
        }
    }
}
