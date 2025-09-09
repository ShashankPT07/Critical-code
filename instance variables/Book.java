class Book {
    public int bookId = 101;
    public String title = "Effective Java";
    public String author = "Joshua Bloch";
    public char genre = 'T'; 
    public boolean isAvailable = true;
    public float rating = 4.7f;
    public double price = 450.0;
    public long isbn = 9780134685991L;

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + isAvailable);
        System.out.println("Rating: " + rating);
        System.out.println("Price: ₹" + price);
        System.out.println("ISBN: " + isbn);
    }
}
