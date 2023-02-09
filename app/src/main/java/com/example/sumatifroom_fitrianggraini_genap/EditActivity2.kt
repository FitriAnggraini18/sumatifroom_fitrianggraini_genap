package com.example.sumatifroom_fitrianggraini_genap

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit2)

        @Database(entities = [Tbbarang::class], version = 1)
        abstract class dbbarang : RoomDatabase() {
            abstract fun tbbarangDao():

                    companion object {

                @Volatile private var instance : = null
                private val LOCK = Any()

                operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
                    instance ?: buildDatabase(context).also {
                        instance = it
                    }
                }

                private fun buildDatabase(context: Context) = .databaseBuilder(
                    context.applicationContext, ::class.java,
                   ::class.java,
                    "20,5425db"
                ).build()

            }
    }
}