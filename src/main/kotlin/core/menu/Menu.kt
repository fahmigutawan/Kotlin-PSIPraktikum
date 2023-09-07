package core.menu

data class Menu(
    val route: String,
    val content:() -> Unit
)