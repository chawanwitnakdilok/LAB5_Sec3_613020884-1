package com.example.lab5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowdetail(v:View){
        val intent = Intent(  this, SecondActivity::class.java)
        intent.putExtra("stdData", student(IdEDT.text.toString(),nameEDT.text.toString(),ageEDT.text.toString().toInt()))
        startActivity(intent)
    }
}