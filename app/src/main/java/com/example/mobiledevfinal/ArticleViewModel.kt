package com.example.mobiledevfinal
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArticleViewModel: ViewModel() {
    var articles: MutableLiveData<List<Article>> = MutableLiveData()

    init {
        articles.value = listOf(
            Article(1, "a", "a", "a")
        )
    }

    fun getArticlesList() = articles
}