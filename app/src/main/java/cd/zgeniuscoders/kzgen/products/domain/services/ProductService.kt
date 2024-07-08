package cd.zgeniuscoders.kzgen.products.domain.services

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductService {

    suspend fun getProducts(): List<Product>

    suspend fun getProduct(): Product

}