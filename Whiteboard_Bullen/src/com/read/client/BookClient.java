package com.read.client;

import com.read.Book;
import com.read.Genre;

class BookClient {
    public static void main(String[] args) {
        //Book instances
        Book book = new Book("Corporate Finance for Dummies", "Michael Tillaird", 4);
        book.setGenre(Genre.FINANCE);
        book.openBook();
        book.changePage(25);
        book.turnPage();
        book.closeBook();
        System.out.println();

        Book book2 = new Book("Wish You Were Here","Jodi Picoult", 3.7);
        book2.setGenre(Genre.FICTION);
        book2.setPage(10);
        book2.openBook();
        book.changePage(8);
        book2.closeBook();
        System.out.println();

        Book book3 = new Book("Naruto", "Masashi Kishimoto", 4.8);
        book3.setGenre(Genre.MANGA);
        book3.openBook();
        book3.changePage(55);
        book3.closeBook();
        System.out.println();

        //toString
        System.out.println(book);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);
        System.out.println();
    }
}