package com.example.movies.data

import com.google.gson.annotations.SerializedName

data class MovieList(

    @SerializedName("results")  // results come from json data, as array name
    val movie: List<Movie>

)
