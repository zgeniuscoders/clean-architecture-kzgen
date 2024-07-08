package cd.zgeniuscoders.kzgen.products.domain.usecases

import cd.zgeniuscoders.kzgen.products.domain.services.ProductService

class ProductInteractor private constructor(
    val getProductUseCase: GetProductUseCase,
    val getProductsUseCase: GetProductsUseCase
){
    companion object {
        fun build(service: ProductService): ProductInteractor {
            return ProductInteractor(
                GetProductUseCase(service),
                GetProductsUseCase(service)
            )
        }
    }
}