package com.books.client;

import com.books.Book;
import com.books.Genre;

import java.util.Arrays;

class BookClientArgs {

    public static void main(String[] args) {
                                                                                                                        // must first check for the presence of your (required) 3 arguments
        if (args.length != 2) {
            String usage = "Usage: java BookClientArgs <title> <author>";
            String example = "Example: Pride and Prejudice by Jane Austen";
            String note = "Note: Genre available to choose from " + Arrays.toString(Genre.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;                                                                                                     // early return from main(), application exits
        }
                                                                                                                        // at this point, you can safely proceed, because you got your arguments
                                                                                                                        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

                                                                                                                        //Step 1: convert the arguments into proper types
        String title = args[0];
        String author = args[1];
                                                                                                                        // Step 2: create a book object from these ingredients
        Book book = new Book(title, author);
                                                                                                                        // Step 3: print it and congratulate them on their order
        System.out.println("Your book has been downloaded to kindle reader");
        System.out.println(book);                                                                                       // toString automatically called
    }

    private static void args(String title, String author ) {
        String[] i = new String[2];
        i[0] = title;
        i[1] = author;

        System.out.println(i.length);
        System.out.println(Arrays.toString(i));

    }


}