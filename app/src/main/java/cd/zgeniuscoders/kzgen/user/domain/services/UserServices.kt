package cd.zgeniuscoders.kzgen.user.domain.services

import cd.zgeniuscoders.kzgen.user.domain.models.User

interface UserServices {
    suspend fun login(username: String, password: String): User?

    suspend fun register(user: User)
}