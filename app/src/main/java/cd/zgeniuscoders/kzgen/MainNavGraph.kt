package cd.zgeniuscoders.kzgen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cd.zgeniuscoders.kzgen.products.ui.views.products.ProductScreen

@Composable
fun SetupMainNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = MainScreenRoute.home.route
    ) {
        composable(route = MainScreenRoute.home.route) {
            HomePage()
        }
        composable(route = MainScreenRoute.products.route) {
            ProductScreen()
        }
        composable(route = MainScreenRoute.notifications.route) {
            NotificationScreen()
        }
        composable(route = MainScreenRoute.settings.route) {
            SettingsScreen()
        }
    }
}