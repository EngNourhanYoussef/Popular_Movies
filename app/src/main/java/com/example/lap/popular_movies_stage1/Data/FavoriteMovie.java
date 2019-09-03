package com.example.lap.popular_movies_stage1.Data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "favoriteMovies")
public class FavoriteMovie  {
    @PrimaryKey
    private int id;
    private String title;
    private String releaseDate;
    private String rate;
    private String popularity;
    private String overview;
    private String poster;
    private String backdrop;

    public FavoriteMovie(int id, String title, String releaseDate, String rate, String popularity, String overview, String poster, String backdrop) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.rate = rate;
        this.popularity = popularity;
        this.overview = overview;
        this.poster = poster;
        this.backdrop = backdrop;
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

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRate() {
        return rate;
    }
    public void setRate(String synopsis) {
        this.rate = rate;
    }

    public String getPopularity() {
        return popularity;
    }
    public void setPopularity(String overview) {
        this.popularity = popularity;
    }

    public String getOverview() {
        return overview;
    }
    public void setOverview(String synopsis) {
        this.overview = synopsis;
    }

    public String getPoster() {
        return poster;
    }
    public void setPoster(String image) {
        this.poster = image;
    }

    public String getBackdrop() {
        return backdrop;
    }
    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }


}

    



