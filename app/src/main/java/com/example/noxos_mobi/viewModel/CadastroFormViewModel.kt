package com.example.noxos_mobi.viewModel

import androidx.lifecycle.ViewModel
import com.example.noxos_mobi.repository.CadastroRepository

class CadastroFormViewModel : ViewModel() {
    private val repository = CadastroRepository.getInstance()
}