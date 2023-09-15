package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao {


    @Query("SELECT * from Contact")
    fun getQuotes() :List<Entity>

    @Insert
    //suspend using by coroutine library
    suspend fun insertQuote(entity: Entity)
}