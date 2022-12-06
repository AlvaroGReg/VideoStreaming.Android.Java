package es.lernesto.videostreamingjava.model;

public class BannerMovies {

    Integer id_movie;
    String movieTitle;
    String URL_image;
    String URL_file;

    public BannerMovies(Integer id_movie, String movieTitle, String URL_image, String URL_file) {
        this.id_movie = id_movie;
        this.movieTitle = movieTitle;
        this.URL_image = URL_image;
        this.URL_file = URL_file;
    }

    public Integer getId_movie() {
        return id_movie;
    }

    public void setId_movie(Integer id_movie) {
        this.id_movie = id_movie;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getURL_image() {
        return URL_image;
    }

    public void setURL_image(String URL_image) {
        this.URL_image = URL_image;
    }

    public String getURL_file() {
        return URL_file;
    }

    public void setURL_file(String URL_file) {
        this.URL_file = URL_file;
    }
}
