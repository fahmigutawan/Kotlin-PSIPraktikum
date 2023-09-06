package bab2.tugas2.data

class Bab2Nomor2Repository{
    val db = Bab2Nomor2Database()
    fun getAllBook() = db.datas

    fun addBook(title:String) = db.datas.add(title)
}