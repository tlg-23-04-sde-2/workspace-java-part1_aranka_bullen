package com.read;


public class Book {
    //static constants
    public static final int MIN_PAGE = 1;
    public static final int MAX_PAGE = 1000;
    public static final double MIN_RATE = 1.0;
    public static final double MAX_RATE = 5.0;

    //private instances
    private String title;
    private String author;
    private double rating;
    private int page = 1;
    private Genre genre;

    // constructors
    public Book() {
    }
    public Book(String title, String author) {
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public Book(String title,String author, double rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    //accessor methods
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getRating() {
        if(rating >= MIN_RATE && rating <= MAX_RATE) {
            return rating;
        }
        else {
            System.out.printf("%s is not yet rated. Please enter a value between %s and %s\n",getTitle(), MIN_RATE, MAX_RATE);
            return 0.0;
        }
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public int getPage() {
        if (page >= MIN_PAGE && page <= MAX_PAGE) {
            return page;
        }
        else {
            System.out.printf(" Page %s is an invalid entry. Please enter a value between %s and %s\n",page, MIN_PAGE, MAX_PAGE);
            return 0;
        }
    }
    public void setPage(int page) {
        this.page = page;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //Business-code methods
    public void turnPage() {
        ++page;
        System.out.printf("Turning to page %s\n", getPage());
    }
    public void changePage(int page) {
        int oldPage= this.page;
        int skipped= Math.abs(oldPage-page);
        int newPage;
        if(oldPage < page) {
            newPage = oldPage + skipped;
            System.out.printf("Skipping to page %s\n",  newPage);
        }
        else if(oldPage > page) {
            newPage = oldPage - skipped;
            System.out.printf("Skipping to page %s\n",newPage);
        }
        else {
            newPage = oldPage;
            System.out.printf("Page %s does not exist. Please enter a valid range between %s and %s.\n",
                    getPage(), MIN_PAGE, MAX_PAGE);
        }
        newPage=oldPage;
    }
    public void openBook(){
        int page;
        System.out.printf("Opening %s, a novel written by %s. Page %s\n",
                getTitle(), getAuthor(), getPage());
    }
    public void closeBook() {
        System.out.printf("Closing %s.\n", getTitle());
    }

    //toString
    public String toString() {
        return String.format("Book Title: %s, Author: %s, Page: %s, Genre: %s, Rated: %s", getTitle(),
                getAuthor(), getPage(), getGenre(), getRating());
    }
}