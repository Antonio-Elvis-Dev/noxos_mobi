package com.example.noxos_mobi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.noxos_mobi.databinding.ActivityMainBinding
import com.example.noxos_mobi.view.Cadastro
import com.example.noxos_mobi.view.Main
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.buttonLogin.setOnClickListener{
            val email = binding.txtEmail.text.toString()
            val senha = binding.txtPassword.text.toString()


            when {
                email.isEmpty() -> {
                    mensagem(it, "Coloque seu email!")
                }

                senha.isEmpty() -> {
                    mensagem(it, "Preencha a senha!")
                }

                senha.length <= 5 -> {
                    mensagem(it, "A senha precisa ter 6 ou mais caracteres!")
                }

                else -> {
                    navegarParaHome()
                }
            }
        }
        binding.telaCadastro.setOnClickListener {
            abrirTelaCadastro()
        }
    }

    private fun mensagem(view: View, mensagem:String){
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#ff0000"))
        snackbar.setTextColor(Color.parseColor("#ffffff"))
        snackbar.show()
    }
    private fun navegarParaHome(){
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
        finish()
    }

    private fun abrirTelaCadastro() {
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }
}