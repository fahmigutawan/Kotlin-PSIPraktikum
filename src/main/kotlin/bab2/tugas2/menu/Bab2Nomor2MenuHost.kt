package bab2.tugas2.menu

import bab2.tugas2.menu.main.Bab2Nomor2Main
import core.menu.Menu
import core.menu.MenuHost

fun Bab2Nomor2MenuHost() {
    val host = MenuHost.Builder()

    host.build(
        Bab2Nomor2Routes.MAIN.name,
        listOf(
            Menu(
                Bab2Nomor2Routes.MAIN.name
            ) {
                Bab2Nomor2Main(host)
            },
            Menu(
                Bab2Nomor2Routes.ADD.name
            ) {
                print("INI ADD")
            }
        )
    )
}