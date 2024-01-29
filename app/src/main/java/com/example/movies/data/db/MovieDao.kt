package com.example.movies.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movies.data.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies: List<Movie>)

    @Query("DELETE FROM trending_movies") //trending_movies is a table name
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM trending_movies") //trending_movies is a table name
    suspend fun getMovies(): List<Movie>

}