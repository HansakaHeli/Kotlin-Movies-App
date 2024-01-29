package com.example.movies.data.datasourceImplementation

import com.example.movies.data.api.TMDBService
import com.example.movies.data.datasource.MovieRemoteDataSource
import com.example.movies.data.model.MovieList
import retrofit2.Response

class MovieRomoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
):MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getTrendingMovies(apiKey)


}