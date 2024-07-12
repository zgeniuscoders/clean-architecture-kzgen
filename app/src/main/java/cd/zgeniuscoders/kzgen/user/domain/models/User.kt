package cd.zgeniuscoders.kzgen.user.domain.models

data class User(
    var email: String,
    var password: String,
    var username: String,
    var token: String? = null,
    var refreshToken: String? = null,
    var isLoggedIn: Boolean = false,
)