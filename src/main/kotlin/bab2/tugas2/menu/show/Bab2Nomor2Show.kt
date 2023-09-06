package bab2.tugas2.menu.show

import bab2.tugas2.data.Bab2Nomor2Repository
import bab2.tugas2.menu.Bab2Nomor2Routes
import core.menu.MenuHost
import java.lang.Exception

fun Bab2Nomor2Show(
    host: MenuHost,
    repo:Bab2Nomor2Repository
) {
    println("Berikut Buku yang ada")
    if(repo.getAllBook().size == 0){
        println("---TIDAK ADA BUKU---")
    }else{
        repo.getAllBook().forEachIndexed { index, s ->
            println("${index + 1}. $s")
        }
    }
    println()

    println("1. Kembali")
    println("2. Keluar")

    when(readln().toInt()){
        1 -> {
            host.navigate(Bab2Nomor2Routes.MAIN.name)
        }

        2 -> {
            host.exit(
                goodbyeMessage = {
                    print("Terima kasih telah menggunakan aplikasi ini")
                }
            )
        }

        else -> {
            println("\n***Angka yang anda masukkan tidak tersedia***\n")
            host.navigate(Bab2Nomor2Routes.SHOW.name)
        }
    }
}