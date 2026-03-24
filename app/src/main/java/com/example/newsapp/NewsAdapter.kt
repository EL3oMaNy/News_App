package com.example.newsapp

import android.app.Activity
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ArticleListItemBinding

class NewsAdapter(val a: Activity, val articles: ArrayList<Article>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: NewsViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class NewsViewHolder(binding: ArticleListItemBinding): RecyclerView.ViewHolder(binding.root)
}