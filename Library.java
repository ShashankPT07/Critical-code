class Library {

    public int totalBooks;

    public void books() {
        System.out.println("List of books in the library");
    }

    public void members() {
        System.out.println("Number of registered members");
        books();
    }

    public void borrow() {
        System.out.println("Borrowing process of the library");
        members();
    }

    public void returnBook() {
        System.out.println("Returning process of the library");
        borrow();
    }

    public void timings() {
        System.out.println("Library opening and closing timings");
        returnBook();
    }
}
