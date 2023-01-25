package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)
        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
            if(counter == 100) {
                upgradeButton.visibility = View.VISIBLE
            }
        }
        upgradeButton.setOnClickListener {
            upgradeButton.visibility = View.INVISIBLE
            button.text = getString(R.string.UpgradedButtonTxt)
            button.setOnClickListener {
                counter += 2
                textView.text = counter.toString()
            }
        }
    }
    var counter = 0


}