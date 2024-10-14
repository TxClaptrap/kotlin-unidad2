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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun Calculatron() {
    Column (modifier = Modifier.fillMaxHeight()) {
        Row (horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth().padding(end = 10.dp, top = 10.dp)) {
            Text (
                text = "0"
            )

        }

        Column (verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight()) {
            FilaBotones(listOf("7", "8", "9", "/"))
            FilaBotones(listOf("4", "5", "6", "*"))
            FilaBotones(listOf("1", "2", "3", "-"))
            FilaBotones(listOf("C", "0", "=", "+"))

        }
    }
}

@Composable
fun FilaBotones(botones: List<String>) {
        Row (horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            botones.forEach { numero ->
                Button(onClick = {}, modifier = Modifier.weight(1f)) { Text(numero) }
            }
            /*for (numero in botones)
                Button(onClick = {}, modifier = Modifier.weight(1f)) { Text(numero) }*/
        }
}

@Composable
@Preview(showBackground = true)
fun Pantallica() {

    Calculatron()
}