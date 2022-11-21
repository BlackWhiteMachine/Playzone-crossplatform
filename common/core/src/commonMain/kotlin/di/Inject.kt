package di

import org.kodein.di.DirectDI
import org.kodein.di.instance

object Inject {

    private var direct: DirectDI? = null

    val di: DirectDI
        get() = requireNotNull(direct)

    fun createDependencies(tree: DirectDI) {
        direct = tree
    }

    inline fun <reified T> instance(): T = di.instance()
}