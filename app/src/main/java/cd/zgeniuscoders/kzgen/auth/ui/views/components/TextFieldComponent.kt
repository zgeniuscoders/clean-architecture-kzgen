package cd.zgeniuscoders.kzgen.auth.ui.views.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldComponent(textValue: String, label: String, onValueChange: (value: String) -> Unit) {
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp),
        value = textValue,
        onValueChange = { onValueChange(it) },
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color.White
        ),
        placeholder = {
            Text(label)
        }
    )
}

