package com.example.sumatifroom_fitrianggraini_genap

class Tbbarang {
    @Entity
    data class TBbarang (
        @PrimaryKey
        val nis:Int,
        val nama:String,
        val kelas:String,
        val alamat:String,
    )

    annotation class PrimaryKey

    annotation class Entity
    ,


}