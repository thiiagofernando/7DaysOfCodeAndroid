package br.com.alura.devhub.service

import br.com.alura.devhub.model.GitHubProfileWeb
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("/users/{user}")
    suspend fun buscarPerfil(@Path("user") user:String): GitHubProfileWeb
}