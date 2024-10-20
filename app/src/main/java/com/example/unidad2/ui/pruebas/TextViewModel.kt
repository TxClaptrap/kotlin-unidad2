package com.example.unidad2.ui.pruebas

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class TextViewModel: ViewModel() {
    val apellido = MutableLiveData("")

    fun onTextoChange(newTexto: String) {
        apellido.value = newTexto
    }
}

