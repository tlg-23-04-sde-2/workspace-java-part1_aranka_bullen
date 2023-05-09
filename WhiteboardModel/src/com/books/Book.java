package com.books;

public class Book {
    // static constants
    public static final int MIN_CHAPTER = 1;
    public static final int MAX_CHAPTER = 60;
    public static final int MIN_PAGE = 1;
    public static final int MAX_PAGE = 1000;
    public static final double MIN_RATING = 1.0;
    public static final double MAX_RATING = 5.0;

    // static constants that changes if change is made
    public static int getNumOfInstance() {
        return instances;
    }
    public static int instances= 0;

    // private fields or instances here                                                                                 // theses require an accessor method to be access outside of class
    private String title;
    private String author;                                                                                               // author does not change
    private Genre genre;
    private int page = 1;                                                                                                // constraints [1-1000]
    private int chapter = 1;                                                                                             // constraints [1-60]
    private boolean isManga;
    private double rating;                                                                                               // constraints [1.0 to 5.0]

    // constructors here
    public Book() {
        instances++;
    }
    public Book(String title) {
        this();
        setTitle(title);
    }
    public Book(String title, String author) {
        this(title);
    }
    public Book(String title, int chapter, int page) {
        this(title);
        setChapter(chapter);
        setPage(page);
    }
    public Book(String title, Genre genre, boolean isManga, double rating) {
        this(title);
        setGenre(genre);
        setManga(isManga);
        setRating(rating);
    }



    // methods here
    public void selectGenre() {
        System.out.println("Selecting "+ getGenre());
    }

    public void startBook() {
        System.out.println("Opening "+ getTitle() + ": Chapter: "+ getChapter() + ", Page " + getPage());
    }

    public void turnPage() {                                                                                            // use method page++ for simplified version
        int currentPage = page;
        int nextPage = currentPage + 1;
        System.out.println("Turning to page: " + nextPage);

    }

    public void goToPage(int page) {
        int oldPage = this.page;
        int pageNumSkipped = Math.abs(oldPage- page) ;                                                                  //
        int desiredPage;
        if(oldPage < page) {
            desiredPage = oldPage + pageNumSkipped;
        }
        else if(oldPage > page) {
            desiredPage =oldPage - pageNumSkipped;
        }
        else {
            desiredPage = oldPage;
        }
        System.out.println(" Turning to page " + desiredPage);
        this.page = desiredPage;
    }

    public void closeBook() {
        System.out.println("Closing " + getTitle());
    }


// accessor methods here

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
        System.out.println(" This book was written by " + getAuthor());
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }
    //TODO: set MIN_P and MAX_P
    public void setPage(int page) {
        this.page = page;
    }


    public int getChapter() {
        return chapter;
    }
    // TODO: set MIN_CHAP and MAX_CHAP
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }


    public boolean isManga() {
        return isManga;
    }
    public void setManga(boolean isManga) {                                                                             // based on booktype option will display booktype available

        String booktype;
        switch (isManga ? "Manga" : "Non-Manga") {
            case "Manga":
                booktype = "Manga";
                System.out.println("This is a " + booktype + " book.");
                break;
            case "Non-Manga":
                booktype = "Non-Manga";
                System.out.println(getTitle() + " is a " + getGenre() + " book." +
                        " Please try again for a Manga book entry.");
                break;
            default:
                booktype = "Invalid";
                System.out.println(getTitle() + " is not a valid Manga book entry. Please try again.");
                break;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    // toString here
    public String toString() {
        return "Title: " + getTitle() + " Author: " + getAuthor() + " Chapter: " + getChapter() + " Page: " + getPage() + " Rated: "
                + getRating() + "/5.0" + " Genre: " + getGenre() +" Manga: "+ isManga();
    }

}