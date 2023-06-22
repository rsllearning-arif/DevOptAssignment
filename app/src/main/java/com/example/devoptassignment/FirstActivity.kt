package com.example.devoptassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FirstActivity : AppCompatActivity() {
    private lateinit var progressBar: LinearLayout
    private lateinit var activityText: TextView
    private lateinit var launcherButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        progressBar = findViewById<LinearLayout?>(R.id.progress_bar_container).apply {
            lifecycleScope.launch {
                visibility = View.VISIBLE
                delay(2000)
                visibility = View.GONE
            }
        }
        activityText = findViewById<TextView?>(R.id.text).apply {
            text = "This is Activity - 1"
        }
        launcherButton = findViewById<Button?>(R.id.launcher_button).apply {
            setOnClickListener {
                val intent = Intent(this@FirstActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        Log.d("BugInfo", "FirstActivity: onCreate called.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BugInfo", "FirstActivity: onStart called.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BugInfo", "FirstActivity: onResume called.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BugInfo", "FirstActivity: onPause called.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BugInfo", "FirstActivity: onStop called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BugInfo", "FirstActivity: onDestroy called.")
    }
}