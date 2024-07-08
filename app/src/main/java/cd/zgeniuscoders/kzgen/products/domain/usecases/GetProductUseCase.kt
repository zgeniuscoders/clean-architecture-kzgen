package cd.zgeniuscoders.kzgen.products.domain.usecases

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.products.domain.services.ProductService
import retrofit2.Response

class GetProductUseCase(private val service: ProductService) {
    suspend fun run(): Product {
        return service.getProduct()
    }
}