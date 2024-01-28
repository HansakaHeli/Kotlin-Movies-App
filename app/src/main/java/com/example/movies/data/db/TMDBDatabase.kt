package com.example.movies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movies.data.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class TMDBDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDao // Return movieDao object

}