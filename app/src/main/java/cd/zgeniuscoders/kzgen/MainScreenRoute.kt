package cd.zgeniuscoders.kzgen

sealed class MainScreenRoute(val route: String) {
    object home : MainScreenRoute("home_screen")
    object products : MainScreenRoute("products_screen")
    object notifications : MainScreenRoute("notifications_screen")
    object settings : MainScreenRoute("settings_screen")
}