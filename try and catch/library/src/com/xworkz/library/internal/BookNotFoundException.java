package com.xworkz.library.internal;

public class BookNotFoundException extends Exception {
    public String checkBookId(int id) {
        if (id <= 0) {
            return "Book ID not found";
        } else {
            return "Valid Book ID";
        }
    }
}
