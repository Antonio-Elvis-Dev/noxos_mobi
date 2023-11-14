package com.example.noxos_mobi.view

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.noxos_mobi.MainActivity
import com.example.noxos_mobi.R
import com.google.android.material.snackbar.Snackbar

class Cadastro : AppCompatActivity() {
    private lateinit var txtNome: EditText
    private lateinit var txtEmail: EditText
    private lateinit var txtPassword: EditText
    private lateinit var txtConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        // Inicializa os EditTexts
        txtNome = findViewById(R.id.txtNome)
        txtEmail = findViewById(R.id.txtEmail)
        txtPassword = findViewById(R.id.txtPassword)
        txtConfirmPassword = findViewById(R.id.txtConfirmPassword)

        // Configura o ouvinte de clique para o botão de cadastro
        val buttonCadastro: Button = findViewById(R.id.buttonCadastro)
        buttonCadastro.setOnClickListener {
            validarCampos(it)
        }
    }

    // Método para validar os campos
    // Método para validar os campos
    private fun validarCampos(view: View) {
        val nome = txtNome.text.toString()
        val email = txtEmail.text.toString()
        val senha = txtPassword.text.toString()
        val confirmacaoSenha = txtConfirmPassword.text.toString()

        if (TextUtils.isEmpty(nome) || TextUtils.isEmpty(email) || TextUtils.isEmpty(senha) || TextUtils.isEmpty(confirmacaoSenha)) {
            exibirMensagemErro(view, "Todos os campos são obrigatórios.")
            return
        }

        else if (senha.length < 6) {
            exibirMensagemErro(view, "A senha deve ter pelo menos 6 caracteres.")
            return
        }

        else if (senha != confirmacaoSenha) {
            exibirMensagemErro(view, "A senha e a confirmação de senha não coincidem.")
            return
        }

        else {
            exibirMensagemSucesso(view, "Cadastro realizado com sucesso!")
            val handler = Handler()
            handler.postDelayed({
                abrirTelaLogin(view)
            }, 2000)
        }
    }

    private fun exibirMensagemErro(view: View, mensagem:String){
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#ff0000"))
        snackbar.setTextColor(Color.parseColor("#ffffff"))
        snackbar.show()
    }

    private fun exibirMensagemSucesso(view: View, mensagem: String) {
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#006B82"))
        snackbar.setTextColor(Color.parseColor("#ffffff"))
        snackbar.show()    }

    fun abrirTelaLogin(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
