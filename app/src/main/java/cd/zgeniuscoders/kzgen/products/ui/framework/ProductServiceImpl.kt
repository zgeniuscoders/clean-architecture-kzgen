package cd.zgeniuscoders.kzgen.products.ui.framework

import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.products.domain.services.ProductService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class ProductServiceImpl (val service: ProductApi): ProductService {


    override suspend fun getProducts(): List<Product> {
        val body= service.getProducts().body()
        if (body!=null){
            return body.data
        }

        return  emptyList()
    }


    override suspend fun getProduct(): Product {
        return service.getProduct().body()!!
    }


}