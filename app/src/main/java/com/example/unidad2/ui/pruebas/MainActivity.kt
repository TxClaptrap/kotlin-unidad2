package com.example.unidad2.ui.pruebas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CalculadoraAppTheme
import com.example.unidad2.ui.calculadora.CalculadoraViewModel
import com.example.unidad2.ui.calculadora.Calculatron

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { CalculadoraAppTheme {
            Calculatron(viewModel = CalculadoraViewModel())
        } }
    }
}
@Preview(showBackground = true) //No puede usarse preview si se pasan parámetros a la función con preview
@Composable
fun Pantallica() {
    CalculadoraAppTheme {
        Calculatron(CalculadoraViewModel())
    }
}