package bab2.tugas2.menu.add

import bab2.tugas2.data.Bab2Nomor2Repository
import bab2.tugas2.menu.Bab2Nomor2Routes
import core.menu.MenuHost

fun Bab2Nomor2Add(
    host:MenuHost,
    repo:Bab2Nomor2Repository
) {
    println("Tambahkan buku:")
    repo.addBook(readln())

    println("1. Kembali")
    println("2. Tambah lagi")
    println("3. Keluar")

    when(readln().toInt()){
        1 -> {
            host.navigate(Bab2Nomor2Routes.MAIN.name)
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
            host.navigate(Bab2Nomor2Routes.ADD.name)
        }
    }
}