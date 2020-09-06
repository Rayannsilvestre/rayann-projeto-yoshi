package com.example.projeto_yoshi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviar(componente: View) {
        val nome = et_nome.text.toString().toString()
        val idade = et_idade.text.toString().toInt()
        val altura = et_altura.text.toString().toDouble()
        val alturaIdeal = 1.60
        val idadeIdeal = 13

        if (et_nome.length() < 3) {
            Toast.makeText(
                this,
                "Escreva um nome de pelo menos 3 letras",
                Toast.LENGTH_LONG
            ).show()
        }
            if (et_idade.length() < 1 ) {
                Toast.makeText(
                    this,
                    "Informe sua idade",
                    Toast.LENGTH_LONG
                ).show()
            }
            if (et_altura.length() < 3) {

                Toast.makeText(
                    this,
                    "Informe sua altura como no exemplo abaixo",
                    Toast.LENGTH_LONG
                ).show()
            }


         else {

            if (idade < idadeIdeal && altura >= alturaIdeal) {
                tv_resultado.text = "$nome você ainda é muito novo só tem tamanho"
                tv_resultado.setTextColor(Color.RED)
            } else if (idade >= idadeIdeal && altura < alturaIdeal) {
                tv_resultado.text = "$nome, você tem o tamanho de uma criança, você não pode entrar"
                tv_resultado.setTextColor(Color.RED)

            } else if (idade < idadeIdeal && altura < alturaIdeal) {
                tv_resultado.text = "$nome, você é uma criança não pode entrar"
                tv_resultado.setTextColor(Color.RED)
            } else {
                tv_resultado.text = "Se divirta, $nome"
                tv_resultado.setTextColor(Color.BLUE)
            }
        }
    }
}