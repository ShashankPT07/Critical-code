class Movie {
    public int movieId = 301;
    public String title = "Inception";
    public String director = "Christopher Nolan";
    public char genre = 'S'; 
    public boolean isAvailableOnStreaming = true;
    public float rating = 8.8f;
    public double boxOfficeCollection = 829.89; 
    public long releaseYear = 2010L;

    public void displayMovie() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Available on Streaming: " + isAvailableOnStreaming);
        System.out.println("Rating: " + rating);
        System.out.println("Box Office Collection: $" + boxOfficeCollection + "M");
        System.out.println("Release Year: " + releaseYear);
    }
}
