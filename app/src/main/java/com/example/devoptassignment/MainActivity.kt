package com.example.devoptassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var dangerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dangerButton = findViewById<Button?>(R.id.danger_button).apply {
            setOnClickListener {
                throw Exception("You shouldn\'t click on danger button")
            }
        }
    }
}
