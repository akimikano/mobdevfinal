package com.example.mobiledevfinal

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter: RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    val articles: List<Article> = ArrayList<Article>()

    inner class ArticleViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = articles.size
}