package com.example.movies.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.R
import com.example.movies.data.model.Movie
import com.example.movies.databinding.ListItemBinding

class MovieAdapter(): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    private val movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>){
        movieList.clear()
        movieList.addAll(movies)
    }

    // This function creates and returns a new instance of MyViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder { // MyViewHolder is the return type

        // Get a LayoutInflater instance from the context of the parent view group
        val layoutInflater = LayoutInflater.from(parent.context)

        // Inflate the layout XML file specified by R.layout.list_item using DataBindingUtil
        // and obtain a binding object that allows access to the views in the inflated layout
        val binding: ListItemBinding = DataBindingUtil.inflate(
            // Pass the LayoutInflater instance
            layoutInflater,
            // Specify the layout resource ID to inflate
            R.layout.list_item,
            // Specify the parent view group to be the parent of the inflated layout
            parent,
            // Specify whether the inflated layout should be attached to the parent view group during inflation (false in this case)
            false
        )

        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    class MyViewHolder(val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(movie:Movie){
            binding.titleTextView.text = movie.title
            binding.descTextView.text = movie.overview

            val posterURL = "https://image.tmdb.org/t/p/w500/" + movie.posterPath

            // Using Glide library to load an image from a URL into the specified ImageView
            Glide.with(binding.imageView.context) // Initialize Glide with the context of the ImageView
                .load(posterURL) // Specify the URL of the image to be loaded
                .into(binding.imageView) // Load the image into the ImageView

        }

    }


}