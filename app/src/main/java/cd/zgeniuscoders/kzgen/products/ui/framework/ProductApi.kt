package cd.zgeniuscoders.kzgen.products.ui.framework

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.products.domain.models.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {
    @GET("/api/products/")
    suspend fun getProducts(): Response<ProductResponse>

    @GET("/api/products/1")
    suspend fun getProduct(): Response<Product>
}