package cd.zgeniuscoders.kzgen.products.domain.models

data class Product(
    val id: String,
    val category: Category,
    val image: String,
    val images: List<String>,
    val name: String,
    val description: String,
    val price: Int,
)
