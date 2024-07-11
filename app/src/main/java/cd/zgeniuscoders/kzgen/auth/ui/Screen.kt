package cd.zgeniuscoders.kzgen.auth.ui

sealed class Screen(val route: String){
    object login: Screen("login_screen")
    object register: Screen("register_screen")
    object forgot_password: Screen("forgot_password")
    object reset_password: Screen("reset_password")
}