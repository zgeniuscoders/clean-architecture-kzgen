package cd.zgeniuscoders.kzgen.products

import cd.zgeniuscoders.kzgen.products.domain.services.ProductService
import cd.zgeniuscoders.kzgen.products.domain.usecases.ProductInteractor
import cd.zgeniuscoders.kzgen.products.ui.framework.ProductApi
import cd.zgeniuscoders.kzgen.products.ui.framework.ProductServiceImpl
import cd.zgeniuscoders.kzgen.products.ui.views.test.TestVM
import org.koin.androidx.compose.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val productModule = module {
    single <ProductApi>{
        Retrofit.Builder()
            .baseUrl("http://10.224.196.180:8000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductApi::class.java)
    }

    //
    single<ProductInteractor> {
        val api=get<ProductApi>()
        val serviceImpl=ProductServiceImpl(api)
        ProductInteractor.build(serviceImpl)
    }

    viewModel<TestVM> {
        val productInteractor=get<ProductInteractor>()
        TestVM(productInteractor)
    }
}