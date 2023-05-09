package net.flix;



public class MovieClient {
    public static void main(String[] args) {
            Movie movie1 = new Movie();
            movie1.setTitle("Titanic");
            movie1.setReleaseYear(1997);
            movie1.setRevenue(750_000_000);
            System.out.println(movie1);

            Movie movie2 = new Movie("Mario", 2023, 500_000_00, Rating.PG, Genre.ACTION);          //calls for the net.flix.Movie constructor
            System.out.println(movie2);

            Movie movie3 = new Movie( "White Roses");
            System.out.println(movie3);

    }


}