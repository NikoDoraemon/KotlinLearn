package com.location.uicustomviews

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class TitleLayout(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.title, this)
        val btnBack: Button = findViewById(R.id.titleBack)
        btnBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        val btnEdit: Button = findViewById(R.id.titleEdit)
        btnEdit.setOnClickListener {
            Toast.makeText(context, "You clicked edit button", Toast.LENGTH_SHORT).show()
        }
    }

}