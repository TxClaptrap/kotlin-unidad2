package com.example.unidad2.ui.calculadora

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class CalculadoraViewModel:ViewModel() {
    val display = MutableLiveData("0") //PAra darle el valor por defecto al display

    fun onDisplayChange(newCalculo: String) {

        //"C" ->
        if (newCalculo == "C") {
            display.value = "0"
        }

        else if (display.value?.startsWith("0") == true) {
            display.value = newCalculo
        }

        else if (newCalculo == "=") {
           display.value = ExpressionBuilder(display.value).build().evaluate().toString()
        }
        else {
            display.value += newCalculo //Para concatenar en el valor, +=
        }
    }
}