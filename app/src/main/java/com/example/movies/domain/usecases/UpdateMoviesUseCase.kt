package com.example.movies.domain.usecases

import com.example.movies.data.model.Movie
import com.example.movies.domain.repository.MovieRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie>? = movieRepository.updateMovies()

}