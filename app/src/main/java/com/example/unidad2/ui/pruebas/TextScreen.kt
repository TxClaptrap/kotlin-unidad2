package com.example.unidad2.ui.pruebas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier

//@Preview(showBackground = true)
@Composable
fun PantallaPrincipal(viewModel: TextViewModel) {
    val texto: String by viewModel.apellido.observeAsState("")
    TextField(
        modifier = Modifier.fillMaxSize(),
        value = texto,
        onValueChange = {viewModel.onTextoChange(it)}
    )
    Text(text = texto)
}