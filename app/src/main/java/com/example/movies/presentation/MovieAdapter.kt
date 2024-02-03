package com.example.movies.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.R
import com.example.movies.data.model.Movie
import com.example.movies.databinding.ListItemBinding

class MovieAdapter(): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    // Fake comment
    // Another fake comment

    private val movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>){
        movieList.clear()
        movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
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

            val posterURL = ""

        }

    }


}