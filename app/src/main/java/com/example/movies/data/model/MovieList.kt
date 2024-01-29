package com.example.movies.data.model

import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")  // results come from json data, as array name
    val movies: List<Movie>

)

