
package com.someshswami9.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var textView = findViewById<TextView>(R.id.textView)
    var count = 0
    fun reset(view : View){
        count = 0;
        textView.text = count.toString()
    }
    fun addOne(view: View){
        count++
        textView.text = count.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}