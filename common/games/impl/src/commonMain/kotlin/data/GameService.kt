package data

import data.models.GameRequest

interface GameService {

    suspend fun fetchAllGames(): List<GameRequest>

    suspend fun searchGame(query: String): List<GameRequest>
}