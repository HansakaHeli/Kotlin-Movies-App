package com.example.movies.di

import com.example.movies.domain.usecases.GetMoviesUseCase
import com.example.movies.domain.usecases.UpdateMoviesUseCase
import com.example.movies.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ):ViewModelFactory{
        return ViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}