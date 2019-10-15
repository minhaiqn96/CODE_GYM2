package entertainment;

import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private String authorName;

    public Book() {
    }

    public Book(String title, int pages, String authorName) {
        this.title = title;
        this.pages = pages;
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "This book has title: "
                + getTitle()
                + ", pages: "
                + getPages()
                + ", authorName: "
                + getAuthorName();
    }
}
