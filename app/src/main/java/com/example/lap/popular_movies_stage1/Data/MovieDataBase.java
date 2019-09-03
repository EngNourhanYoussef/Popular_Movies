package com.example.lap.popular_movies_stage1.Data;


import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database( entities = {FavoriteMovie.class} , version = 3 , exportSchema = false)
public  abstract class MovieDataBase extends RoomDatabase {
    private static final String Tag = MovieDataBase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "MoviesList";
    private static MovieDataBase sInstance;

    public static MovieDataBase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                sInstance = Room.databaseBuilder(context.getApplicationContext(), MovieDataBase.class,
                        MovieDataBase.DATABASE_NAME).fallbackToDestructiveMigration()
                        .build();
            }

        }
        return sInstance;
    }
    public abstract MovieDao MovieDao();
}

