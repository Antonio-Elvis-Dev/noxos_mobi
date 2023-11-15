package com.example.noxos_mobi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.noxos_mobi.R

class Search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }
    fun abrirTelaHome(view: View) {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
    fun abrirTelaPesquisa(view: View) {
        val intent = Intent(this, Search::class.java)
        startActivity(intent)
        finish()
    }
    fun abrirTelaProducao(view: View) {
        val intent = Intent(this, Producao::class.java)
        startActivity(intent)
        finish()
    }

    fun abrirTelaPedidos(view: View) {
        val intent = Intent(this, Pedidos::class.java)
        startActivity(intent)
        finish()
    }
}