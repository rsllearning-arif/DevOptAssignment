package com.example.devoptassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {
    private lateinit var text: TextView
    private lateinit var progressBar: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        progressBar = findViewById<LinearLayout?>(R.id.progress_bar_container).apply {

            lifecycleScope.launch {
                visibility = View.VISIBLE
                delay(2000)
                visibility = View.GONE
            }
        }

        text = findViewById<TextView?>(R.id.text).apply {
            text = "This is Activity - 2"
        }
        Log.d("BugInfo", "SecondActivity: onCreate called.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BugInfo", "SecondActivity: onStart called.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BugInfo", "SecondActivity: onResume called.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BugInfo", "SecondActivity: onPause called.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BugInfo", "SecondActivity: onStop called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BugInfo", "SecondActivity: onDestroy called.")
    }
}