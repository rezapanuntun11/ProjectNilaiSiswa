package com.example.projectnilaisiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nimin : EditText = findViewById(R.id.nim)
        var namain : EditText = findViewById(R.id.nama)
        var nilaiin : EditText = findViewById(R.id.nilai)

        btn_proses.setOnClickListener{

            intent = Intent ( this, Activity2::class.java)
            intent.putExtra("nim",nimin.getText())
            intent.putExtra("nama",namain.getText())
            intent.putExtra("nilai",nilaiin.getText())
            startActivity(intent)
        }

    }
}
