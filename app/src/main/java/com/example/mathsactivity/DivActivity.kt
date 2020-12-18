package com.example.mathsactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class DivActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_div)
    }

    fun divevent(view: View) {
        var getNum1=findViewById<EditText>(R.id.num1)
        var getNum2=findViewById<EditText>(R.id.num2)
        var res=getNum1.text.toString().toInt()/getNum2.text.toString().toInt()
        var result=findViewById<TextView>(R.id.myresult)
        result.text=res.toString()
    }
    fun backevent(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}