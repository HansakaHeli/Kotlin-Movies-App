package com.example.movies.data

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "trending_movies") // Create a table named trending_movies in Room database
data class Movie(

    @SerializedName("id")
    val Movieid:Int,

    @SerializedName("overview")
    val overview: String,

    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("release_date")
    val releseDate: String,

    @SerializedName("title")
    val title: String
)
