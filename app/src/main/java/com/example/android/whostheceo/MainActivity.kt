package com.example.android.whostheceo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.start_btn)
        val nameEditText = findViewById<TextView>(R.id.name_edit_text)

        startBtn.setOnClickListener {

            if(nameEditText.text.toString().isEmpty()) {
                        Toast.makeText(this, "Enter name", Toast.LENGTH_SHORT).show()
                    } else {
                val Intent = Intent(this, QuizQuestionActivity::class.java)
                startActivity(Intent)

            }

        }
    }



}
