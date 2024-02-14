package com.example.movies.presentation.di

import com.example.movies.data.api.TMDBService
import com.example.movies.data.datasource.MovieRemoteDataSource
import com.example.movies.data.datasourceImplementation.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService):MovieRemoteDataSource{
        return MovieRemoteDataSourceImpl(
            tmdbService,
            apiKey
        )
    }


}