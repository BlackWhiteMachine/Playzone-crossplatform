package di

import org.kodein.di.DI

val coreModule = DI.Module("CoreModule") {
    importAll(
        serializationModule,
        mainModule,
    )
}