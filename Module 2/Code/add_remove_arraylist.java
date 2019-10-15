public static ArrayList<Book> bookList = new ArrayList<Book>();

    static {
        Book book1 = new Book("Hai", 10, "H");
        bookList.add(book1);
        Book book2 = new Book("Jacky", 20, "J");
        bookList.add(book2);
        Book book3 = new Book("Tyn", 30, "T");
        bookList.add(book3);
    }

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

    public void addBook(Book book) {
        if (book != null) {
            this.bookList.add(book);
        } else {
            System.out.println("No book to add");
        }
    }

    public void removeBook(String title) {
        if (title != null) {
            for (int i = 0; i < Book.bookList.size(); i++) {
                if (title.equals(Book.bookList.get(i).getTitle())) {
                    Book.bookList.remove(bookList.get(i));
                }
            }
        } else {
            System.out.println("No book to remove");
        }
    }