package cd.zgeniuscoders.kzgen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import cd.zgeniuscoders.kzgen.products.ui.views.products.ProductPage
import cd.zgeniuscoders.kzgen.ui.theme.KzgenTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

        setContent {
            KzgenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ProductPage()
                }
            }
        }
    }
}


