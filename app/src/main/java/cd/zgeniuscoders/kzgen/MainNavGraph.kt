package cd.zgeniuscoders.kzgen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cd.zgeniuscoders.kzgen.user.ui.views.settings.SettingsScreen
import cd.zgeniuscoders.kzgen.products.ui.views.home.HomePage
import cd.zgeniuscoders.kzgen.products.ui.views.products.ProductScreen

@Composable
fun SetupMainNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Routes.home.route
    ) {
        composable(route = Routes.home.route) {
            HomePage()
        }
        composable(route = Routes.products.route) {
            ProductScreen()
        }
        composable(route = Routes.notifications.route) {
            NotificationScreen()
        }
        composable(route = Routes.settings.route) {
            SettingsScreen()
        }
    }
}