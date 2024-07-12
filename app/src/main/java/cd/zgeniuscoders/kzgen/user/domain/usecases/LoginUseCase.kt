package cd.zgeniuscoders.kzgen.user.domain.usecases

import cd.zgeniuscoders.kzgen.user.domain.services.UserServices

class LoginUseCase(private val userServices: UserServices) {

    suspend fun run(username: String, password: String) {
        userServices.login(username, password)
    }

}