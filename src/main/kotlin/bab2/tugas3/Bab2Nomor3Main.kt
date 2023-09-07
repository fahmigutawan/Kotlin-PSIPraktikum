package bab2.tugas3

fun Bab2Nomor3Main(){
    for(i in 1..100){
        if(i.isPrime()){
            print("$i, ")
        }
    }
}

fun Int.isPrime():Boolean{
    var moduledToZeroCount = 0
    for(j in 1..this){
        if(this % j == 0){
            moduledToZeroCount++
        }
    }

    return moduledToZeroCount==2
}