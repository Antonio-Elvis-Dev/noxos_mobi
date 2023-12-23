package com.example.noxos_mobi.services.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product")
class ProductModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cod")
    val cod: String = ""

    @ColumnInfo(name = "name")
    val name: String = ""

    @ColumnInfo(name = "qtd")
    val qtd: Int = 0

    @ColumnInfo(name = "price")
    val price: Double = 0.0

    @ColumnInfo(name = "dtvalidade")
    val dataValidade: String = ""

    @ColumnInfo(name = "dtfabricacao")
    val dataFabric: String = ""


}
//
