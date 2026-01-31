package com.example.news.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("v2/everything?apiKey=73176502fb0a4e558a5d329c7a8a8fe4")
    suspend fun loadArticles(
        @Query("q") topic: String,
        @Query("language") language: String,
    ): NewsResponseDto
}