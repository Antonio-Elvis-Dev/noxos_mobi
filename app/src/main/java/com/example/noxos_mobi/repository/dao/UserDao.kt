package com.example.noxos_mobi.repository.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.noxos_mobi.services.model.UserModel

@Dao
interface UserDao {
    @Insert
    fun save(user: UserModel): Long

    @Update
    fun update(user: UserModel): String

    @Delete
    fun delete(user: UserModel)


}