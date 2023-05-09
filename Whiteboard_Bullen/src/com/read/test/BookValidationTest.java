package com.read.test;

import com.read.Book;
import com.read.Genre;

import java.util.Arrays;

class BookValidationTest {
    public static void main(String[] args) {

        Book book = new Book();
        book.setPage(0);
        System.out.println( "Page is" +book.getPage());
        book.setPage(1);
        System.out.println( "Page is" +book.getPage());
        book.setPage(1000);
        System.out.println( "Page is" +book.getPage());
        book.setPage(1001);
        System.out.println( "Page is" +book.getPage());

        book.setRating(0.9);
        System.out.println("Rating is " + book.getRating());
        book.setRating(1.0);
        System.out.println("Rating is " + book.getRating());
        book.setRating(5.0);
        System.out.println("Rating is " + book.getRating());
        book.setRating(5.1);
        System.out.println("Rating is " + book.getRating());

        book.changePage(1001);
        System.out.println();
        book.changePage(1000);
        System.out.println();
        book.changePage(1);
        System.out.println();
        book.changePage(0);
    }

}