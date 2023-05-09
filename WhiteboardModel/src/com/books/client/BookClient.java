package com.books.client;

import com.books.Book;
import com.books.Genre;

public class BookClient {
    public static void main(String[] args) {

        Book book = new Book();
        book.setGenre(Genre.FINANCE);
        book.setTitle("Corporate Finance For Dummies");
        book.startBook();
        book.setAuthor("Michael Taillard");
        String bookSummary = " Welcome to Finance Land\n" +
                "\n" +
                "Corporate Finance For Dummies helps you get straight on key concepts so you can succeed in your " +
                "college course and your career. Understand and analyze big-picture finances―statements, valuations, " +
                "risk management―and you’ll be able to follow the dollars like a pro. This updated edition includes " +
                "info on jobs in the field, anti-money laundering, electronic transactions like cryptocurrency and NFTs," +
                " and more on corporate behavior. You’re on the road to a career in the shimmering tower of finance―Dummies " +
                "can help you get there.";
        book.closeBook();



        System.out.println();





        Book book2 = new Book("Wish You Were Here", 1, 1);
        book2.startBook();
        book2.setAuthor("Jodi Picoult");
        book2.setGenre(Genre.DEFAULT);
        System.out.println();


        Book book3 = new Book("Naruto", Genre.FICTION, true, 4.5 );
        book3.setAuthor("Masashi Kishimoto");
        book3.setPage(2);
        book3.startBook();
        bookSummary = "Author/artist Masashi Kishimoto was born in 1974 in rural Okayama Prefecture, Japan. Like many " +
                "kids, he was first inspired to become a manga artist in elementary school when he read Dragon Ball. " +
                "After spending time in art college, he won the Hop Step Award for new manga artists with his story " +
                "Karakuri. After considering various genres for his next project, Kishimoto decided on a story steeped " +
                "in traditional Japanese culture. His first version of Naruto, drawn in 1997, was a one-shot story about" +
                " fox spirits; his final version, which debuted in Weekly Shonen Jump in 1999, quickly became the most" +
                " popular ninja manga in the world. The series would also spawn multiple anime series, movies, novels, " +
                "video games and more. Having concluded the series in late 2014, Masashi Kishimoto has kept himself busy " +
                "this year with the side story Naruto: The Seventh Hokage and the Scarlet Spring and writing the story " +
                "for the latest Naruto movie, Boruto: Naruto the Movie, both of which will focus on the title " +
                "character's son, Boruto.";
        book3.goToPage(20);
        book3.closeBook();

        System.out.println();



        System.out.println(book);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);
















    }


}