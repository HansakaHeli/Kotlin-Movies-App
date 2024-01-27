package com.example.movies.data

import com.google.gson.annotations.SerializedName

data class Movie(

    @SerializedName("id")
    val id:Int,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("release_date")
    val releseDate: String,

    @SerializedName("title")
    val title: String
)
