package com.example.noxos_mobi.viewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.noxos_mobi.repository.CadastroRepository

class CadastroFormViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = CadastroRepository.getInstance(application)
}