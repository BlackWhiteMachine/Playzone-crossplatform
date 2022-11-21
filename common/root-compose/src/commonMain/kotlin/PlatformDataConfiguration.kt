import di.Inject
import di.coreModule
import di.gamesModule
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.bindings.Singleton
import org.kodein.di.direct
import org.kodein.di.singleton

object PlatformDataConfiguration {

    fun init(platformConfiguration: PlatformConfiguration) {
        val platformModule = DI.Module("PlatformModule") {
            bind<PlatformConfiguration>() with singleton {
                platformConfiguration
            }
        }

        Inject.createDependencies(
            DI {
                importAll(
                    platformModule,
                    coreModule,
                    gamesModule
                )
            }.direct
        )
    }
}