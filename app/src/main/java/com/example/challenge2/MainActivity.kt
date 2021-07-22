package com.example.challenge2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity<textView : View?>( var tampilkan: String) : AppCompatActivity() {
    private val player2 by lazy {findViewById<Button>(R.id.player2) }
    private val imageView6 by lazy {findViewById<ImageView>(R.id.imageView)}
    private val imageView by lazy {findViewById <ImageView>(R.id.imageView6)}
    private val imageView3 by lazy {findViewById<ImageView>(R.id.imageView6)}
    val suitController = SuitController()
    var indexPemain1: Int = -1
    var indexPemain2 = -1
    var pilihanPemain2: String = ""
    var pilihanPemain1 = ""

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        player2.setOnClickListener {

            val data = arrayOf("Batu", "Gunting", "Kertas").random()
            Toast.makeText(this, "$data kepilih", Toast.LENGTH_SHORT).show()
        }

        val pilihanPemain1 by lazy {
            val findViewById = findViewById<textView>(R.id.pilihanPemain1)
            findViewById
        }
        val imageView2 by lazy { (findViewById<ImageView>(R.id.imageView2)) }
        val imageView4 by lazy { (findViewById<ImageView>(R.id.imageView4)) }
        val imageView5 by lazy { (findViewById<ImageView>(R.id.imageView5)) }

        imageView2.setOnClickListener {
            val imageView2 = "Batu"
            Toast.makeText(this, "$imageView2 dipilih", Toast.LENGTH_SHORT).show()
            val hasil: String? = null
            var tvPemainMenang = hasil


        }
        imageView4.setOnClickListener {
            val imageView4 = "Gunting"
            Toast.makeText(this, "$imageView4 dipilih", Toast.LENGTH_SHORT).show()

        }
        imageView5.setOnClickListener {
            val imageView5 = "Kertas"
            Toast.makeText(this, "$imageView5 dipilih", Toast.LENGTH_SHORT).show()
        }

        fun runGame () = if (pilihanPemain1 != "" && pilihanPemain2 != "") {
            val hasil = suitController.calculateWinner(indexPemain1, indexPemain2).resultValue
            Toast.makeText(this, "$hasil", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Klik kedua pilihan anda pada layar: Pemain 1 (Batu,Gunting,Kertas) dan Com", Toast.LENGTH_SHORT).show()
        }
    }
}









