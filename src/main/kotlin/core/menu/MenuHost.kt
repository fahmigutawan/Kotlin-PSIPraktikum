package core.menu

import kotlin.system.exitProcess

class MenuHost(
    startRoutes: String,
    pagesBuilder: (MenuHost) -> List<Menu>
) {
    private val _startRoutes = startRoutes
    private var _isStarted = false
    private val _pages = pagesBuilder(this).associate {
        it.route to it.content
    }

    fun startActivity() {
        val page = _pages[_startRoutes]

        try {
            page!!()
        } catch (e: Exception) {
            throw java.lang.Exception("Pastikan route yang anda pakai adalah benar")
            return
        }

        _isStarted = true
    }

    fun navigate(
        routes: String
    ) {
        if (!_isStarted) {
            throw java.lang.Exception("Fungsi \"startActivity()\" harus dipanggil terlebih dahulu.")
            return
        }

        val page = _pages[routes]

        try {
            page!!()
        } catch (e: Exception) {
            throw java.lang.Exception("Pastikan route yang anda pakai adalah benar")
            return
        }
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