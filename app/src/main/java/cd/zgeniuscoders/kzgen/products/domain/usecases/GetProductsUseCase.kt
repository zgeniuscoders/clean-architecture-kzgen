package cd.zgeniuscoders.kzgen.products.domain.usecases

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.products.domain.services.ProductService
import retrofit2.Response
import retrofit2.http.GET

class GetProductsUseCase(private val service: ProductService) {



    suspend fun run(): List<Product> {
        return service.getProducts()
    }

}