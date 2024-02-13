package com.example.movies.di

import com.example.movies.data.datasource.MovieCacheDataSource
import com.example.movies.data.datasourceImplementation.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideMovieCacheDataSource():MovieCacheDataSource{
        return MovieCacheDataSourceImpl()
    }
}