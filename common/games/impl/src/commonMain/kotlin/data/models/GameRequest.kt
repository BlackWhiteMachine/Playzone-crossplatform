package data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameRequest(
    @SerialName("gameID") val gameId: String,
    @SerialName("title") val title: String,
    @SerialName("description") val description: String,
    @SerialName("version") val version: String,
    @SerialName("size") val size: String,
)