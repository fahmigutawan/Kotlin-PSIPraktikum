package core.menu

import java.lang.Exception
import kotlin.system.exitProcess

class MenuHost {
    lateinit var builder:MenuHostBuilder
    companion object{
        fun Builder():MenuHost {
            val host = MenuHost()
            host.builder = MenuHostBuilder()
            return host
        }
    }

    class MenuHostBuilder{
        private var _startRoutes = ""
        private var _pages = mapOf<String, () -> Unit>()

        fun build(
            startRoutes: String,
            pagesBuilder: List<Menu>
        ) {
            _startRoutes = startRoutes
            _pages = pagesBuilder.associate {
                it.route to it.content
            }
            val startPage = _pages[_startRoutes]  ?: throw Exception("Pastikan route sudah ada di pageBuilder")
            startPage()
        }

        fun navigate(
            routes: String
        ) {
            val page = _pages[routes] ?: throw Exception("Pastikan route sudah ada di pageBuilder")
            page()
        }

        fun exit(
            goodbyeMessage: (() -> Unit)? = null
        ) {
            goodbyeMessage?.let {
                it()
            }

            exitProcess(0)
        }
    }

    fun build(
        startRoutes: String,
        pagesBuilder: List<Menu>
    ) = builder.build(startRoutes, pagesBuilder)

    fun navigate(
        routes: String
    ) {
        builder.navigate(routes)
    }

    fun exit(
        goodbyeMessage: (() -> Unit)? = null
    ) {
        goodbyeMessage?.let {
            it()
        }

        exitProcess(0)
    }
}