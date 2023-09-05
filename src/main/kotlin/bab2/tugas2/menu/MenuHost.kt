package bab2.tugas2.menu

class MenuHost(
    startRoutes: MenuRoutes,
    pagesBuilder:List<Menu>
) {
    var route = startRoutes
    val pages = pagesBuilder.associate {
        it.route to it.content
    }

    fun navigate(routes: MenuRoutes){
        when(routes){
            MenuRoutes.MAIN -> {

            }

            MenuRoutes.ADD -> {

            }

            MenuRoutes.SHOW -> {

            }
        }
    }
}