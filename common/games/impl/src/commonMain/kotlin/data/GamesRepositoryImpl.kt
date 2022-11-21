package data

import data.models.GameRequest
import domain.GameModel
import domain.GamesRepository

class GamesRepositoryImpl(
    private val gameService: GameService
): GamesRepository {

    override suspend fun fetchAllGames(): List<GameModel> =
        gameService.fetchAllGames().map(::convertToGameModel)

    override suspend fun searchGame(query: String): List<GameModel> =
        gameService.searchGame(query).map(::convertToGameModel)

    private fun convertToGameModel(request: GameRequest): GameModel =
        GameModel(
            gameId = request.gameId,
            title = request.title,
            description = request.description,
            version = request.version,
            size = request.size
        )
}