package com.example.noxos_mobi.services.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User")
class UserModel {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: String = ""

    @ColumnInfo(name = "email")
    var name: String = ""

    @ColumnInfo(name = "email")
    var email: String = ""

    @ColumnInfo(name = "password")
    var password: String = ""
}