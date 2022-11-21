package domain

interface GamesRepository {

    suspend fun fetchAllGames(): List<GameModel>

    suspend fun searchGame(query: String): List<GameModel>
}