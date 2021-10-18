package com.example.lastseen

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv: TextView
    var status = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)

    }

    override fun onResume() {
        super.onResume()
        tv.text = "${tv.text} \n online"
    }

    override fun onPause() {
        super.onPause()
        val dateFormat = SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        tv.text = "${tv.text} \n Last seen: $dateFormat"
         
    }

}
