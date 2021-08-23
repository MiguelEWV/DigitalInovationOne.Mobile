package com.example.digitalinovationcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //================================VARIAVEiS======================
         val etNota1 = etNota1
        val etNota2 = etNota2
        val etFaltas = etFaltas
        val btCalcular = btCalcular
        val result = tvResultado
        //==========================================================


        btCalcular.setOnClickListener{
            val nota1 = Integer.parseInt(etNota1.text.toString())
            val nota2 = Integer.parseInt(etNota2.text.toString())
            val faltas = Integer.parseInt(etFaltas.text.toString())

            val media = (nota1 + nota2)/2

            if(media >= 6 && faltas <= 10){
                result.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + faltas )
            }else{
                result.setText("Aluno foi Reprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + faltas )
            }
        }


    }
}