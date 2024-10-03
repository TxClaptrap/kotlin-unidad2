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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
        setContent { CampoRellenable() }
    }
}



//@Preview(showBackground = true)
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
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(bottom = 50.dp)) {
            Text(
                text = "Pedido ID: $id",
                textAlign = TextAlign.Left,

            )

            Text(
                text = "$fecha",
                textAlign = TextAlign.Left,

            )
        }

        Text(
            text = "Precio Total: $precioTotal $",
            textAlign = TextAlign.Right,
            modifier = Modifier.fillMaxWidth()
        )

        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {},
                modifier = Modifier.padding(end = 20.dp)) { Text("Cancelar Pedido")}
            Button(onClick = {}) { Text("Confirmar Pedido")}
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
@Preview(showBackground = true)
fun PantallaPrincipal() {
        /*Pizzeria(nombre = "La Capra della tua Mamma",
            direccion = "C/Patata Cocida 69",
            descripcion = "Vieni qua, piccolo cicio bombo!")*/

        DetallesPedido(id = 2,
            fecha = LocalDateTime.now(),
            precioTotal = 254f)
}

@Composable
@Preview(showBackground = true)
fun CampoRellenable() {
    var texto by remember { mutableStateOf("") }
    TextField(
        modifier = Modifier.padding(24.dp),
        value = texto,
        onValueChange = { newText -> texto = newText },
        label = { Text("Texto") }
    )
}