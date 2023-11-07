package com.example.noxos_mobi.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noxos_mobi.R
import com.example.noxos_mobi.databinding.ActivityPedidosBinding
import com.example.noxos_mobi.databinding.ActivitySearchBinding

class Search : AppCompatActivity() {
    private lateinit var binding : ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btnHome.setOnClickListener{
            navegarParaHome()

        }
        binding.btnPedidos.setOnClickListener{
            navegarParaPedidos()

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