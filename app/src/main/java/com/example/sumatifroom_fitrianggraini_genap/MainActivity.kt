package com.example.sumatifroom_fitrianggraini_genap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }
    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val buku = db.().getTbbarang()
            Log.d("MainActivity","dbResponse:$")
        }
    }

    private fun halEdit() {
        btnInput.setOnClickListener {
            startActivity(Intent(this, EditActivity::class.java))

        }