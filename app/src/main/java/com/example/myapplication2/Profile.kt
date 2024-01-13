package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val sett = findViewById<ImageView>(R.id.backBtn)
        sett.setOnClickListener {
            val intent = Intent(this@Profile, Home::class.java)
            startActivity(intent)
        }

        val tab = findViewById<Button>(R.id.about)
        tab.setOnClickListener {
            val intent = Intent(this@Profile, TabLayoutAct::class.java)
            startActivity(intent)
        }

        val status =
            arrayOf("Menikah", "Single")

        val spinner = findViewById<Spinner>(R.id.spinner)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, status)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
            }
        }