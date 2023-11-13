package com.example.noxos_mobi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noxos_mobi.MainActivity
import com.example.noxos_mobi.R

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }
    //falta chamar o método abrirTelaLogin() usando o id telaLogin do textView de activity_cadastro.xml
    private fun abrirTelaLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}