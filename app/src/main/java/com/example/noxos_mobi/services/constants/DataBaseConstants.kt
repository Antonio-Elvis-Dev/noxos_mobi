package com.example.noxos_mobi.services.constants

class DataBaseConstants private constructor(){
    object DBNOXOS{
        const val TABLE_NAME = "DBnoxos"

        object COLUMNS{
            const val ID = "id"
            const val NAME = "NAME"
            const val EMAIL = "EMAIL"
        }
    }
}