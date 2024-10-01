package com.example.unidad2

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unidad2.ui.theme.Unidad2Theme
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {}
    }
}



@Preview(showBackground = true)
@Composable
fun Pizzeria(nombre: String = "La Capra della tua Mamma", direccion: String = "C/Patata Cocida 69", descripcion: String = "Vieni qua, piccolo cicio bombo!") {
    Column {
        Text(
            text = "Bienvenidos a la pizzería $nombre!",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )


            Text(
                text = "$direccion",
                textAlign = TextAlign.Right,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "$descripcion",
                textAlign = TextAlign.Right,
                modifier = Modifier.fillMaxWidth()
            )

    Row (horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()) {
        Button(onClick = {}) { Text("Registrarse")}
            Button(onClick = {}) { Text("Login")}
        }
        }
    }

@Composable
fun DetallesPedido(id: Int, fecha: LocalDateTime, precioTotal: Float) {
    Column {

        Text(
            text = "Detalles Pedido",
            textAlign = TextAlign.Center
        )

        Text(
            text = "Pedido ID: $id",
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )


        Text(
            text = "$fecha",
            textAlign = TextAlign.Right,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "$precioTotal",
            textAlign = TextAlign.Right,
            modifier = Modifier.fillMaxWidth()
        )

        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {}) { Text("Cancelar Pedido")}
            Button(onClick = {}) { Text("Confirmar Pedido")}
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable



@Preview(showBackground = true)
fun GPantallaPrincipal() {
        Pizzeria(nombre = "La Capra della tua Mamma",
            direccion = "C/Patata Cocida 69",
            descripcion = "Vieni qua, piccolo cicio bombo!")

        DetallesPedido(id = 2,
            fecha = LocalDateTime.now(),
            precioTotal = 254f)
}