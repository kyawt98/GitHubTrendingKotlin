package com.kyawt.githubtrending.model.api
import com.kyawt.githubtrending.model.GitHubTrending
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService{

    @GET("/search/repositories")
    fun getRepo(
        @Query("q") search : String = "trending",
        @Query("sort") sort : String = "stars"

    ): Call<GitHubTrending>
}