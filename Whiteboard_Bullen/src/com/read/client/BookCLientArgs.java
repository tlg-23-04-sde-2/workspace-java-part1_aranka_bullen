package com.read.client;
import com.read.Book;
import com.read.Genre;
import java.util.Arrays;

class BookClientArgs {
    public static void main(String[] args) {

        if (args.length != 2) {
            String usage = "Usage: java BookClientArgs <title> <author>";
            String example = "Example: Pride_and_Prejudice by Jane_Austen";
            String note = "Note: Genre available to choose from " + Arrays.toString(Genre.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }
        System.out.println("You provided " + args.length + " arguments");
        String title = args[0];
        String author = args[1];

        Book book = new Book(title, author);
        System.out.println("Your book has been downloaded to kindle reader");
        System.out.println(book);
    }
    private static void args(String title, String author ) {
        String[] i = new String[2];
        i[0] = title;
        i[1] = author;

        System.out.println(i.length);
        System.out.println(Arrays.toString(i));
    }
}