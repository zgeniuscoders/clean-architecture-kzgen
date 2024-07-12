package cd.zgeniuscoders.kzgen.user.domain.models.request

import cd.zgeniuscoders.kzgen.user.domain.models.User

data class RegisterRequest(
    val user: User
)