package com.example.lap.popular_movies_stage1.Model;


import java.io.Serializable;

public class Movies implements Serializable {
    private String title, poster, release, rate, overview,id;

    //constructor
    public Movies(){
    }

    public Movies(String title, String poster, String release, String rate, String overview, String id){
        this.title = title;
        this.poster = poster;
        this.release = release;
        this.rate = rate;
        this.overview = overview;
        this.id = id;
    }

    //generate getters and setters
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

    public void setId(String id) {
        this.title = id;
    }

    public String getId() {
        return id;
    }
}
