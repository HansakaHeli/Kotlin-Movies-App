package com.example.movies.domain.repository

import com.example.movies.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies():List<Movie>?

}