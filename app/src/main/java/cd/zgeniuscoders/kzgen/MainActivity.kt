package cd.zgeniuscoders.kzgen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cd.zgeniuscoders.kzgen.user.SetupAuthNavGraph
import cd.zgeniuscoders.kzgen.ui.theme.KzgenTheme
import cd.zgeniuscoders.kzgen.views.MainScreen

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

        setContent {
            KzgenTheme {

                val isLogged by remember {
                    mutableStateOf(true)
                }

                navController = rememberNavController()

                if (isLogged) {
                    MainScreen(navController)
                } else {
                    SetupAuthNavGraph(navHostController = navController)
                }

            }
        }
    }
}


