package com.example.unidad2.ui.pruebas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unidad2.R


@Composable
fun Formulario(apellido:String, onApellidoChange:(String) -> Unit) {
    TextField(
        value = apellido,
        onValueChange = {onApellidoChange(it)}
    )
    Text(text = apellido)
    Button(onClick = {}) { Text(apellido) }
}



@Composable
fun PantallaPrincipal(viewModel: TextViewModel) {
    val apellido: String by viewModel.apellido.observeAsState("")
    Column(modifier = Modifier.fillMaxSize()) {

        Formulario(apellido) { viewModel.onTextoChange(it)}

    }
}

@Composable

fun ImagenPreview() {
    PantallaPrincipal(TextViewModel())
}

@Composable
@Preview(showBackground = true)
fun PruebaImagen() {
    Column (modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = ""
        )
        Icon(
            imageVector = Icons.Outlined.Favorite,
            contentDescription = ""
        )

    }

}




