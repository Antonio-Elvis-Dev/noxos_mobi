package com.example.noxos_mobi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noxos_mobi.R
import com.example.noxos_mobi.databinding.ActivityHomeBinding
import com.example.noxos_mobi.databinding.ActivityPedidosBinding

class Pedidos : AppCompatActivity() {
    private lateinit var binding : ActivityPedidosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPedidosBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btnSearch.setOnClickListener{
            navegarParaSearch()

        }
        binding.btnHome.setOnClickListener{
            navegarParaHome()

        }
        binding.btnProducao.setOnClickListener{
            navegarParaProducao()

        }
    }

    private fun navegarParaSearch(){
        val intent = Intent(this, Search::class.java)
        startActivity(intent)
    }
    private fun navegarParaHome(){
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
    private fun navegarParaPedidos(){
        val intent = Intent(this, Pedidos::class.java)
        startActivity(intent)
    }
    private fun navegarParaProducao(){
        val intent = Intent(this, Producao::class.java)
        startActivity(intent)
    }
}