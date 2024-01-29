package com.example.movies.data.api

import com.example.movies.data.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("trending/movie/day")
    suspend fun getTrendingMovies(
        @Query(
            "api_key"
        )apiKey: String
    ) : Response<MovieList>
}