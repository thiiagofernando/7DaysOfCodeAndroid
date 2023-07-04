package br.com.alura.devhub.webclient

import br.com.alura.devhub.service.GitHubService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RetrofitInit {
    val url = "https://api.github.com/";

    private val retrofit = Retrofit.Builder().baseUrl(url)
        .addConverterFactory(MoshiConverterFactory.create()).build()

    val gitHubService get() = retrofit.create(GitHubService::class.java)
}