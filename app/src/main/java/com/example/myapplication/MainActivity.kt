
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etOmset = findViewById<TextView>(R.id.etOmset)
        val etCost = findViewById<TextView>(R.id.etCost)
        val btnHitung = findViewById<TextView>(R.id.btnHitung)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnHitung.setOnClickListener {
            val omset = etOmset.text.toString().toInt()
            val cost = etCost.text.toString().toInt()

            val result = omset - cost
            tvResult.text = "Hasil: IDR " + result.toString() +",-"
        }
    }
}