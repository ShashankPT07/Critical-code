class BookRunner {
    public static void main(String[] args) {
        Author author = new Author(" Rowling");
        Book book = new Book(author);
        book.displayBook();
    }
}