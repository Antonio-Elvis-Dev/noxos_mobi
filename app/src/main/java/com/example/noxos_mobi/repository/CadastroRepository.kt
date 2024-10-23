package com.example.noxos_mobi.repository

import android.content.ContentValues
import android.content.Context
import com.example.noxos_mobi.model.CadastroModel
import com.example.noxos_mobi.repository.database.CadastroDatabase

class CadastroRepository private constructor(context: Context) {

// singleton - controla o numero de instancias de uma classe

    private val cadastroDataBase = CadastroDatabase(context)


    companion object {
        private lateinit var repository: CadastroRepository

        fun getInstance(context: Context): CadastroRepository {

            if (!Companion::repository.isInitialized) {
                repository = CadastroRepository(context)
            }
            return repository

        }
    }

    fun insert(cadastroModel: CadastroModel) {
        val db = cadastroDataBase.writableDatabase
        val values = ContentValues()

        values.put("name", cadastroModel.name)
        values.put("email", cadastroModel.email)
        values.put("passwords", cadastroModel.password)
        db.insert("user", null, values)
    }

    fun update() {

    }
}