package cd.zgeniuscoders.kzgen.user.domain.usecases

import cd.zgeniuscoders.kzgen.user.domain.models.User
import cd.zgeniuscoders.kzgen.user.domain.services.UserServices

class RegisterUseCase(private val userServices: UserServices) {
    suspend fun run(user: User) {
        userServices.register(user)
    }
}