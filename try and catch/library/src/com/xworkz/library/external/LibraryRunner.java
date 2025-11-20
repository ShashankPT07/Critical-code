package com.xworkz.library.external;

import com.xworkz.library.events.BookPrice;
import com.xworkz.library.events.BookName;
import com.xworkz.library.events.BookEdition;

import com.xworkz.library.internal.BookNotFoundException;
import com.xworkz.library.internal.MemberNotFoundException;
import com.xworkz.library.internal.TimingException;
import com.xworkz.library.internal.FineException;
import com.xworkz.library.internal.BookStockException;

public class LibraryRunner {
    public static void main(String[] args) {

        // event objects
        BookPrice book = new BookPrice();
        BookName name= new BookName();
        BookEdition edition = new BookEdition();

        // internal objects
        FineException fine = new FineException();
        BookStockException stock = new BookStockException();


        try {
            book.priceInfo();
        } catch (BookNotFoundException e) {

        }


        try {
            name.nameInfo();
        } catch (MemberNotFoundException e) {

        }


        try {
            edition.editionInfo();
        } catch (TimingException e) {

        }


    }
}
