package com.location.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread {
            println("123")
            println("123")
        }.start()

        val tv: TextView = findViewById(R.id.tv)
        tv.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "Remove", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(this, "Unknown", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}