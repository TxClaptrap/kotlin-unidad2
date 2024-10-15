package com.example.unidad2.ui.pruebas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Formulario(apellido:String, onApellidoChange:(String) -> Unit) {
    TextField(
        value = apellido,
        onValueChange = {onApellidoChange(it)}
    )
    Text(text = apellido)
    Button(onClick = {}) { Text(apellido) }
}


//@Preview(showBackground = true)
@Composable
fun PantallaPrincipal(viewModel: TextViewModel) {
    val apellido: String by viewModel.apellido.observeAsState("")
    Column(modifier = Modifier.fillMaxSize()) {

        Formulario(apellido) { viewModel.onTextoChange(it)}

    }
}

