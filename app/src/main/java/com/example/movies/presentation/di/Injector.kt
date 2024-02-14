package com.example.movies.presentation.di

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent
}