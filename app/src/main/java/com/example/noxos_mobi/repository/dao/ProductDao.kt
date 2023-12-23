package com.example.noxos_mobi.repository.dao

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Update
import com.example.noxos_mobi.services.model.ProductModel

@Dao
interface ProductDao{
    @Insert
    fun save(product:ProductModel): Long

    @Update
    fun update(product: ProductModel): String

    @Delete
    fun delete(product: ProductModel)


}
