class Book {
    int bookId;
    String title;
    String author;

    // Constructor to set book details
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    // Non-static method 
    void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Static method
    static void showLibraryTiming() {
        System.out.println("Library Timing: 9:00 AM to 5:00 PM");
    }

    public static void main(String[] args) {
        Book b = new Book(201, "Java Programming", "H
