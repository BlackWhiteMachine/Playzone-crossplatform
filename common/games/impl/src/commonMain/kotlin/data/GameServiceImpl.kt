package data

import data.models.GameRequest
import data.models.GameSearchRequest
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class GameServiceImpl(private val httpClient: HttpClient): GameService {

    override suspend fun fetchAllGames(): List<GameRequest> {
        return httpClient.post {
            header("Bearer-Authorization", "2bac6ef1-ca6d-42ca-96f3-923c68e88eca")

            url {
                path("games/search")
                setBody(GameSearchRequest(searchQuery = ""))
            }
        }.body()
    }

    override suspend fun searchGame(query: String): List<GameRequest> {
        return httpClient.post {
            header("Bearer-Authorization", "2bac6ef1-ca6d-42ca-96f3-923c68e88eca")

            url {
                path("games/search")
                setBody(GameSearchRequest(searchQuery = query))
            }
        }.body()
    }
}