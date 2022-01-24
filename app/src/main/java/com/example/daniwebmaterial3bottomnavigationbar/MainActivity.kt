package com.example.daniwebmaterial3bottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.page_1 -> {
                    textView.text = getString(R.string.text_label_1)
                    true
                }
                R.id.page_2 -> {
                    textView.text = getString(R.string.text_label_2)
                    true
                }
                R.id.page_3 -> {
                    textView.text = getString(R.string.text_label_3)
                    true
                }
                R.id.page_4 -> {
                    textView.text = getString(R.string.text_label_4)
                    true
                }
                R.id.page_5 -> {
                    textView.text = getString(R.string.text_label_5)
                    true
                }
                else -> false
            }
        }
    }
}