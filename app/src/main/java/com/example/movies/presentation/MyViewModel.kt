package com.example.movies.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movies.domain.usecases.GetMoviesUseCase
import com.example.movies.domain.usecases.UpdateMoviesUseCase

class MyViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase,
    ): ViewModel() {

        fun getMovies() = liveData {
            val movieList = getMoviesUseCase.execute()
            emit(movieList)
        }

        fun updateMovies() = liveData {
            val movieList = updateMoviesUseCase.execute()
            emit(movieList)
        }
}