package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

import androidx.room.Room
import androidx.room.RoomDatabase

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
         val tv =findViewById<TextView>(R.id.tv)

        //here database create is Bad practice beacause database instance create again to again while app run You use Singleton for best practice
        val dao = Room.databaseBuilder(applicationContext,ContactDatabsae::class.java,"contact").build();
        var data= Entity(1,"Pratham singh","9955684837")

        tv.setOnClickListener {
            GlobalScope.launch {
                dao.contactdao().insertQuote(data)
                Log.d("Inserted","data"+data.toString())
                var list= dao.contactdao().getQuotes()
                Log.d("your data", " all data"+list.toString())
            }
        }
}
}