package bab2.tugas2.menu

import core.menu.Menu
import core.menu.MenuHost

fun Bab2Nomor2MenuHost(){
    MenuHost(
        Bab2Nomor2Routes.MAIN.name
    ){
        listOf(
            Menu(
                Bab2Nomor2Routes.MAIN.name
            ){

            },
            Menu(
                Bab2Nomor2Routes.MAIN.name
            ){

            },
            Menu(
                Bab2Nomor2Routes.MAIN.name
            ){

            }
        )
    }
}