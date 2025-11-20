package com.xworkz.library.internal;

public class BookStockException extends Exception {

    public String checkStock(int stock) {
        if (stock == 0) {
            return "Book is out of stock";
        } else {
            return "Book is available";
        }
    }
}
