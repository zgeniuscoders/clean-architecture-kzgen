package cd.zgeniuscoders.kzgen.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cd.zgeniuscoders.kzgen.auth.ui.Screen
import cd.zgeniuscoders.kzgen.auth.ui.views.login.LoginPage
import cd.zgeniuscoders.kzgen.auth.ui.views.register.RegisterPage

@Composable
fun SetupAuthNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.login.route
    ) {
        composable(route = Screen.login.route) {
            LoginPage(navHostController)
        }
        composable(route = Screen.register.route) {
            RegisterPage(navHostController)
        }
    }
}