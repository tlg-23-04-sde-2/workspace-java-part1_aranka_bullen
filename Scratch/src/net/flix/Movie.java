package net.flix;



class Movie {
    // fields or instances here
    private String title;
    private int releaseYear;
    private double revenue;
    private Rating rating;
    private Genre genre;


    // constructors will go here if any or JVM will insert a no argument constructor
    public Movie() {                                                                                                     // this is a no argument constructor
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue, Rating rating, Genre genre) {
        this(title);                                                                                                     //  this() statement delegates to the ctor above to resolve for title
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setRating(rating);
        setGenre(genre);
    }



    // business methods here- pause(), play(), rewind(), fastForward()



    // accessor (get/set) methods here - these provide "controlled access" to the object;s fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // toString methods goes here
    public String toString() {
        return String.format("Movie: Title= %s, Release Year= %s, Revenue= %,2f, Rating= %s, Genre= %s", getTitle(),
                getReleaseYear(),getRevenue(), getRating(), getGenre());

//        return "net.flix.Movie: title = "+ getTitle() + ", Release Year = " + getReleaseYear() +
//        ", Revenue = " + getRevenue() + ", Rating = " + getRating() + ", Genre = " + getGenre();
    }
}