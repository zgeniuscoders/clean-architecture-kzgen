package cd.zgeniuscoders.kzgen.products.ui.views.products

import cd.zgeniuscoders.kzgen.products.domain.models.Product

data class ProductState(
    val product:List<Product>  = emptyList()
)