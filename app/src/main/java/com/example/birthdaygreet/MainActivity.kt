package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBirthdayButton.setOnClickListener {

            val name = name_input.editableText.toString()

            val intent = Intent(this, BirthdayGreetActivity::class.java)

            intent.putExtra(BirthdayGreetActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}