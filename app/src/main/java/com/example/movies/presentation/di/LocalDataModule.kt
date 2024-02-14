package com.example.movies.presentation.di

import com.example.movies.data.datasource.MovieLocalDataSource
import com.example.movies.data.datasourceImplementation.MovieLocalDataSourceImpl
import com.example.movies.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

}