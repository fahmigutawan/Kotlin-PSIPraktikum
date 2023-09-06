package bab2.tugas2.menu.main

import bab2.tugas2.menu.Bab2Nomor2Routes
import core.menu.MenuHost

fun Bab2Nomor2Main(
    host: MenuHost
) {
    println("Selamat datang di perpustakaan. Apa yang ingin anda lakukan?")
    println("1. Tampilkan semua buku")
    println("2. Tambah buku")
    println("3. Keluar")

    when(readln().toInt()){
        1 -> {
            host.navigate(Bab2Nomor2Routes.SHOW.name)
        }

        2 -> {
            host.navigate(Bab2Nomor2Routes.ADD.name)
        }

        3 -> {
            host.exit(
                goodbyeMessage = {
                    print("Terima kasih telah menggunakan aplikasi ini")
                }
            )
        }

        else -> {
            println("\n***Angka yang anda masukkan tidak tersedia***\n")
            host.navigate(Bab2Nomor2Routes.MAIN.name)
        }
    }
}