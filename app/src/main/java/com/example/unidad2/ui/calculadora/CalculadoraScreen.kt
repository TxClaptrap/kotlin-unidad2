package com.example.unidad2.ui.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.livedata.observeAsState
import com.example.unidad2.ui.pruebas.TextViewModel

//import com.example.unidad2.CampoRellenable

class Calculadora : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {  } //CampoRellenable()
    }
}



//@Preview(showBackground = true)
@Composable //Los @Composable empiezan siempre con Mayúscula
fun Calculatron(viewModel: CalculadoraViewModel) {
    val input: String by viewModel.display.observeAsState("0")
    Column (modifier = Modifier.fillMaxHeight()) {
        Row (horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth().padding(end = 10.dp, top = 10.dp)) {
            Text(
                text = input
            )

        }

        Column (verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight()) {
            FilaBotones(listOf("7", "8", "9", "/"), {viewModel.onDisplayChange(it)})
            FilaBotones(listOf("4", "5", "6", "*"), {viewModel.onDisplayChange(it)})
            FilaBotones(listOf("1", "2", "3", "-"), {viewModel.onDisplayChange(it)})
            FilaBotones(listOf("C", "0", "=", "+"), {viewModel.onDisplayChange(it)})

        }
    }
}

@Composable
fun FilaBotones(botones: List<String>, onButtonClick: (String) -> Unit) {
        Row (horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            var lineaAnterior = ""
            botones.forEach { numero ->
                Button(onClick = {onButtonClick(numero + lineaAnterior)}, modifier = Modifier.weight(1f)) { Text(numero) }
                lineaAnterior
            }
            /*for (numero in botones)
                Button(onClick = {}, modifier = Modifier.weight(1f)) { Text(numero) }*/
        }
}

@Composable
@Preview(showBackground = true)
fun Pantallica() {

    Calculatron(CalculadoraViewModel())
}