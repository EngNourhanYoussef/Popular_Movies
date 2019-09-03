package com.example.lap.popular_movies_stage1.utalities;

import android.content.Context;
import com.example.lap.popular_movies_stage1.Model.Movies;
import com.example.lap.popular_movies_stage1.Model.Review;
import com.example.lap.popular_movies_stage1.Model.Trailer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class JSONUtality {

    public static Movies[] getMovieInformationsFromJson(Context context, String json) throws JSONException {

        final String TMDB_BASE_URL = "https://image.tmdb.org/t/p/";
        final String TMDB_POSTER_SIZE = "w500";

        // You guys recommended me to use key strings in my last code review, so here it is :)
        final String TMDB_RESULTS = "results";
        final String TMDB_POSTER_PATH = "poster_path";
        final String TMDB_TITLE = "title";
        final String TMDB_VOTE = "vote_average";
        final String TMDB_OVERVIEW = "overview";
        final String TMDB_RELEASE_DATE = "release_date";

        //I've got some help from: https://www.codevoila.com/post/65/java-json-tutorial-and-example-json-java-orgjson#toc_5
        //and once again the amazing sunshine app.

        JSONObject movieJson = new JSONObject(json);

        JSONArray movieArray = movieJson.getJSONArray(TMDB_RESULTS);

        Movies[] movieResults = new Movies[movieArray.length()];


        for (int i = 0; i < movieArray.length(); i++){
            String poster_path, title, vote_average, overview, release_date;

            Movies movie = new Movies();

            poster_path = movieArray.getJSONObject(i).optString(TMDB_POSTER_PATH);
            title = movieArray.getJSONObject(i).optString(TMDB_TITLE);
            release_date = movieArray.getJSONObject(i).optString(TMDB_RELEASE_DATE);
            vote_average = movieArray.getJSONObject(i).optString(TMDB_VOTE);
            overview = movieArray.getJSONObject(i).optString(TMDB_OVERVIEW);

            //setters
            movie.setPoster(TMDB_BASE_URL + TMDB_POSTER_SIZE + poster_path);
            movie.setTitle(title);
            movie.setRelease(release_date);
            movie.setRate(vote_average);
            movie.setOverview(overview);

            movieResults[i] = movie;
        }

        return movieResults;
    }
    public static Trailer[] getTrailerInformationFromJson(Context context , String json) throws JSONException{

        final String TMDB_TRAILER_RESULTS = "results";
        final String TMDB_TRAILER_KEY = "key";
        final String TMDB_TRAILER_NAME = "name";
         JSONObject trailerJson = new JSONObject(json);
         JSONArray trailerArray = trailerJson.getJSONArray(TMDB_TRAILER_RESULTS);
         Trailer[] trailerResult = new Trailer[trailerArray.length()];
        for (int i = 0; i < trailerArray.length(); i++){
            String trailer_key, trailer_name;

            Trailer trailer = new Trailer();

            trailer_key = trailerArray.getJSONObject(i).optString(TMDB_TRAILER_KEY);

            trailer_name = trailerArray.getJSONObject(i).optString(TMDB_TRAILER_NAME);

            //setters
            trailer.setKey(trailer_key);
            trailer.setName(trailer_name);

            trailerResult[i] = trailer;
        }

        return trailerResult;
    }
    public static Review[] getReviewInformationsFromJson(Context context, String json) throws JSONException {

        final String TMDB_REVIEW_RESULTS = "results";
        final String TMDB_REVIEW_AUTHOR = "author";
        final String TMDB_REVIEW_CONTENT = "content";

        JSONObject reviewJson = new JSONObject(json);

        JSONArray reviewArray = reviewJson.getJSONArray(TMDB_REVIEW_RESULTS);

        Review[] reviewResults = new Review[reviewArray.length()];


        for (int i = 0; i < reviewArray.length(); i++){
            String review_author, review_content;

            Review review = new Review();

            review_author = reviewArray.getJSONObject(i).optString(TMDB_REVIEW_AUTHOR);
            review_content = reviewArray.getJSONObject(i).optString(TMDB_REVIEW_CONTENT);

            //setters
            review.setAuthor(review_author);
            review.setContent(review_content);

            reviewResults[i] = review;
        }

        return reviewResults;
    }



}


