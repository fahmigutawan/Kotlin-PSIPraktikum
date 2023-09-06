package bab2.tugas2.menu

import bab2.tugas2.data.Bab2Nomor2Repository
import bab2.tugas2.menu.add.Bab2Nomor2Add
import bab2.tugas2.menu.main.Bab2Nomor2Main
import bab2.tugas2.menu.show.Bab2Nomor2Show
import core.menu.Menu
import core.menu.MenuHost

fun Bab2Nomor2MenuHost() {
    val host = MenuHost.Builder()
    val repo = Bab2Nomor2Repository()

    host.build(
        Bab2Nomor2Routes.MAIN.name,
        listOf(
            Menu(route = Bab2Nomor2Routes.MAIN.name) {
                Bab2Nomor2Main(host)
            },
            Menu(route = Bab2Nomor2Routes.ADD.name) {
                Bab2Nomor2Add(host, repo)
            },
            Menu(route = Bab2Nomor2Routes.SHOW.name) {
                Bab2Nomor2Show(host, repo)
            }
        )
    )
}