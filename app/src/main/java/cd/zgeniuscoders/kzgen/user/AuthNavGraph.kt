package cd.zgeniuscoders.kzgen.user

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cd.zgeniuscoders.kzgen.Routes
import cd.zgeniuscoders.kzgen.user.ui.views.login.LoginScreen
import cd.zgeniuscoders.kzgen.user.ui.views.register.RegisterScreen


@Composable
fun SetupAuthNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Routes.login.route
    ) {
        composable(route = Routes.login.route) {
            LoginScreen(navHostController)
        }
        composable(route = Routes.register.route) {
            RegisterScreen(navHostController)
        }
    }
}