package cd.zgeniuscoders.kzgen.user.ui.views.register

data class RegisterState(
    var username: String = "",
    var email: String = "",
    var password: String = "",
    var confirmPassword: String = "",
    val isFormValid: Boolean = false,
    val isLoading: Boolean = false,
    val errorMessage: String = ""
)