package com.example.lap.popular_movies_stage1.Data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favoriteMovies")
public class FavoriteMovie  {
    @PrimaryKey
    private int id;
    private String title;
    private String release;
    private String rate;
    private String overview;
    private String poster;


    public FavoriteMovie(int id, String title, String release, String rate, String overview, String poster) {
        this.id = id;
        this.title = title;
        this.release = release;
        this.rate = rate;
        this.overview = overview;
        this.poster = poster;

}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }



}

    



