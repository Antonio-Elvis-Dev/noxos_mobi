package com.example.noxos_mobi.repository

import com.example.noxos_mobi.repository.database.CadastroDatabase

class CadastroRepository private constructor() {

// singleton - controla o numero de instancias de uma classe

    companion object {
        private lateinit var repository: CadastroRepository

        fun getInstance(): CadastroRepository {

            if (!Companion::repository.isInitialized) {
                repository = CadastroRepository()
            }
            return repository

        }
    }

    fun save(){
        CadastroDatabase(null)
    }


}