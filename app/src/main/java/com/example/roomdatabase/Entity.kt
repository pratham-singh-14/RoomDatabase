package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contact")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    val Id:Int,
    val Name:String,
    val Number:String

)
