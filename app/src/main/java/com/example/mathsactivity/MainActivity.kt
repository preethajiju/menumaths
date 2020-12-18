package com.example.mathsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addclickevent(view: View) {
        intent= Intent(this,AddActivity::class.java)
        startActivity(intent)
    }

    fun subclickevent(view: View) {
        intent= Intent(this,SubtActivity::class.java)
        startActivity(intent)
    }

    fun mulclickevent(view: View) {
        intent= Intent(this,MultiplyActivity::class.java)
        startActivity(intent)
    }

    fun divclickevent(view: View) {
        intent= Intent(this,DivActivity::class.java)
        startActivity(intent)
    }
}