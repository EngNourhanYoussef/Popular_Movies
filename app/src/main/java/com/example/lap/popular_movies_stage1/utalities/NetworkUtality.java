package com.example.lap.popular_movies_stage1.utalities;

import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL ;
import java.util.Scanner;

public class NetworkUtality  {
    final static String base_url ="https://api.themoviedb.org/3/movie";
    final static String prama_api_key = "api_key";
    final static String api = "please enter your api ";
    final static String PARAM_LANGUAGE = "language";
    final static String language = "en-US";
    final static String videos = "videos";
    final static String reviews = "reviews";
    public static URL buildUrl( String Movies_Search_Quary  ){
        Uri biuldUri = Uri.parse(base_url).buildUpon().appendEncodedPath(Movies_Search_Quary)
                .appendQueryParameter(prama_api_key , api)
                .appendQueryParameter(PARAM_LANGUAGE, language)
                .build();
        URL url = null;
        try{
            url = new URL(biuldUri.toString());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return url;
    }

    // build another url for trailers
    public static URL buildTrailerUrl(int specificMovieId){
        Uri builtUri = Uri.parse(base_url).buildUpon()
                .appendEncodedPath(String.valueOf(specificMovieId))
                .appendEncodedPath(videos)
                .appendQueryParameter(prama_api_key , api)
                .appendQueryParameter(PARAM_LANGUAGE, language)
                .build();

        URL url = null;
        try{
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return url;
    }

    // build another url for reviews
    public static URL buildReviewUrl(int specificMovieId){
        Uri builtUri = Uri.parse(base_url).buildUpon()
                .appendEncodedPath(String.valueOf(specificMovieId))
                .appendEncodedPath(reviews)
                .appendQueryParameter(prama_api_key , api)
                .appendQueryParameter(PARAM_LANGUAGE, language)
                .build();

        URL url = null;
        try{
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        return url;
    }
   public static String getResponceFromHttp(URL url) throws IOException{
       HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
      try {
          InputStream inputStream = urlConnection.getInputStream();
          Scanner scanner = new Scanner(inputStream);
          scanner.useDelimiter("\\A");
          boolean hasInput = scanner.hasNext();
          if (hasInput) {
              return scanner.next();
          } else {
              return null;
          }
      } finally{
          urlConnection.disconnect();

      }
}
}
