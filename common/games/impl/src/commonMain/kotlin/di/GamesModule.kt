package di

import data.GameService
import data.GameServiceImpl
import domain.GamesRepository
import data.GamesRepositoryImpl
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val gamesModule = DI.Module("GamesModule") {

    bind<GameService>() with singleton {
        GameServiceImpl(instance())
    }

    bind<GamesRepository>() with singleton {
        GamesRepositoryImpl(instance())
    }
}