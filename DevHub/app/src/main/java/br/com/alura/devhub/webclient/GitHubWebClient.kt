package br.com.alura.devhub.webclient

import br.com.alura.devhub.service.GitHubService
import kotlinx.coroutines.flow.flow
import android.util.Log

class GitHubWebClient(
    private val service: GitHubService = RetrofitInit().gitHubService
) {
    fun buscarPerfil(user:String) = flow {
            try {
                emit(service.buscarPerfil(user))
            }catch (e: Exception){
                Log.e("GitHubWebClient", "buscarPerfil: falha ao buscar usuário", e)
            }
    }
}