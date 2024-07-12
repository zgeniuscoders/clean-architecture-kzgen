package cd.zgeniuscoders.kzgen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NotificationScreen() {

    Column {
        Text("Notification")
    }

}

@Preview(showBackground = true)
@Composable

fun NotificationScreenPreview() {
    NotificationScreen()
}
