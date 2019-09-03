package com.example.lap.popular_movies_stage1.Model;

public class Movies {

    private String  id, title, poster, release, rate, overview;

    //constructor
    public Movies(String s, String title, String releaseDate, String rate, String popularity, String overview, String poster, String backdrop){
    }

    public Movies( String id ,String title, String poster, String release, String rate, String overview){
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.release = release;
        this.rate = rate;
        this.overview = overview;
    }

    //generate getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.title = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}


