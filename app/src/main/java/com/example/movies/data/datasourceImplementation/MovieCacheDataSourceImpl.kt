package com.example.movies.data.datasourceImplementation

import com.example.movies.data.datasource.MovieCacheDataSource
import com.example.movies.data.model.Movie

class MovieCacheDataSourceImpl: MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}