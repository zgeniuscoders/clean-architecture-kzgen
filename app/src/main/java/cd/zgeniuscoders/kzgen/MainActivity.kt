package cd.zgeniuscoders.kzgen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cd.zgeniuscoders.kzgen.auth.SetupAuthNavGraph
import cd.zgeniuscoders.kzgen.products.ui.views.products.ProductPage
import cd.zgeniuscoders.kzgen.ui.theme.KzgenTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            KzgenTheme {
//                navController = rememberNavController()
//                SetupAuthNavGraph(navHostController = navController)

                ProductPage()
            }
        }
    }
}


