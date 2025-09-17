class Book {
    public String authorName;
    public Author author;

    public Book(Author author) {
        this.authorName = author.name;
        this.author = author;
    }

    public void displayBook() {
        author.displayAuthor();
    }
}

