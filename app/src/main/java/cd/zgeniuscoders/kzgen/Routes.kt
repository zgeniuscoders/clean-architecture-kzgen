package cd.zgeniuscoders.kzgen

sealed class Routes(val route: String) {
    object login : Routes("login_screen")
    object register : Routes("register_screen")
    object forgot_password : Routes("forgot_password")
    object reset_password : Routes("reset_password")
    object home : Routes("home_screen")
    object products : Routes("products_screen")
    object notifications : Routes("notifications_screen")
    object settings : Routes("settings_screen")
}