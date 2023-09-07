package bab2.tugas1

import java.util.*

class Bab2Nomor1Main {
    val satu = Stack<Int>()
    val dua = Stack<Int>()
    val tiga = Stack<Int>()
    var stackCount:Int

    init {
        println("Masukkan berapa tingkat:")
        stackCount = readln().toInt()

        for (i in stackCount downTo 1) {
            satu.push(i)
        }

        resolveHanoi(stackCount, satu, dua, tiga)
    }

    fun resolveHanoi(n:Int, asal:Stack<Int>, tambahan:Stack<Int>, target:Stack<Int>){
        if (n == 1) {
            transfer(asal, target)
            return
        }

        resolveHanoi(n-1, asal, target, tambahan)
        transfer(asal, target)
        resolveHanoi(n-1, tambahan, asal, target)
    }

    fun transfer(from:Stack<Int>, to:Stack<Int>){
        val tmp = from.pop()
        to.push(tmp)
        printHanoi()
    }

    fun printHanoi(){
        println("TIANG 1 => ${this.satu}")
        println("TIANG 2 => ${this.dua}")
        println("TIANG 3 => ${this.tiga}")
        println()
    }
}
