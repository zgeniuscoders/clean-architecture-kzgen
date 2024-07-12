package cd.zgeniuscoders.kzgen.user.ui.framework

import cd.zgeniuscoders.kzgen.user.domain.models.User
import cd.zgeniuscoders.kzgen.user.domain.models.request.LoginRequest
import cd.zgeniuscoders.kzgen.user.domain.models.request.RegisterRequest
import cd.zgeniuscoders.kzgen.user.domain.services.UserServices
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.RequestBody

class UserServiceImpl(private val service: UserApi) : UserServices {

    override suspend fun login(username: String, password: String): User? {
        val contentType = "application/json"
        val requestBody = RequestBody.create(
            MediaType.parse("application/json"),
            Gson().toJson(
                LoginRequest(username, password)
            )
        )

        val body = service.login(
            contentType,
            requestBody
        ).body()

        if (body != null) {
            return body.data
        }

        return null
    }

    override suspend fun register(user: User) {

        val contentType = "application/json"
        val requestBody = RequestBody.create(
            MediaType.parse("application/json"),
            Gson().toJson(
                RegisterRequest(user)
            )
        )

        val body = service.register(contentType, requestBody)
    }


}