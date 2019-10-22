package com.example.projectnilaisiswa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val bundle = intent.extras
        val nimout = bundle?.get("nim")
        val namaout = bundle?.get("nama")
        val nilaiout = bundle?.get("nilai")
        var nilaiin = nilaiout.toString()
        var nilairange = nilaiin.toInt()

        if (nilairange >= 80){
            keterangan.setText("Anda Mendapat Nilai A")
        }
        else if(nilairange >= 60){
            keterangan.setText("Anda Mendapat Nilai B")
        }
        else if(nilairange >= 40){
            keterangan.setText("Anda Mendapat Nilai C")
        }
        else if(nilairange >= 20){
            keterangan.setText("Anda Mendapat Nilai D")
        }
        else{
            keterangan.setText("Anda Mendapat Nilai E")
        }
        nim_output.setText(""+nimout)
        nama_output.setText(""+namaout)
        nilai_output.setText(""+nilaiout)

        button.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}