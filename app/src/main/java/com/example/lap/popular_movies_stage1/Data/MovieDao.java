package com.example.lap.popular_movies_stage1.Data;


import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.List;

@Dao
public interface MovieDao {
    @Query("SELECT * FROM favoriteMovies ORDER BY id")
    LiveData<List<FavoriteMovie>> loadAllMovies ();
    @Insert
    void insertMovie (FavoriteMovie favoriteMovies);

   @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateMovie(FavoriteMovie favoriteMovies);

   @Delete
    void deleteMovie(FavoriteMovie favoriteMovies);

    @Query("SELECT * FROM favoriteMovies WHERE id = :id")
    FavoriteMovie loadMovieById(int id);
}


