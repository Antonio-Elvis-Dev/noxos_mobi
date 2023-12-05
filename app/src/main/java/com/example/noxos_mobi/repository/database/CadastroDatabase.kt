package com.example.noxos_mobi.repository.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class CadastroDatabase(
    context: Context
) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "noxosdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {

            db.execSQL("create table user(" + " id integer primary key autoincrement, " + " name text, " + " email text, " + "password text );")

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }


}

//@Database(entities = [])
//
//
//val cod: String,
//val name: String,
//val qtd: Int,
//
//val price: Double,
//val dataValidade: String,
//val dataFabric: String,