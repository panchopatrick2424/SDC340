package com.example.contactsaddressbook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Patrick Dave B. Pancho
// November 14, 2026
// PA - Contacts Mobile App
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAvery).setOnClickListener {
            startActivity(Intent(this, ContactOneActivity::class.java))
        }

        findViewById<Button>(R.id.btnJordan).setOnClickListener {
            startActivity(Intent(this, ContactTwoActivity::class.java))
        }
    }
}