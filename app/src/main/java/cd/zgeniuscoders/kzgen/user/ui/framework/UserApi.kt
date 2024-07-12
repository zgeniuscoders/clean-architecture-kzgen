package cd.zgeniuscoders.kzgen.user.ui.framework

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.user.domain.models.response.UserResponse
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UserApi {

    @POST("/api/login/")
    suspend fun login(
        @Header("Content-Type") contentType: String,
        @Body requestBody: RequestBody
    ): Response<UserResponse>

    @POST("/api/register/")
    suspend fun register(
        @Header("Content-Type") contentType: String,
        @Body requestBody: RequestBody
    ): Response<Product>

}