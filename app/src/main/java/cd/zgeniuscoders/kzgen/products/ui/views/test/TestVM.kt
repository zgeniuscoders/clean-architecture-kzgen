package cd.zgeniuscoders.kzgen.products.ui.views.test

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cd.zgeniuscoders.kzgen.products.domain.usecases.ProductInteractor
import kotlinx.coroutines.launch

class TestVM(val interactor: ProductInteractor) : ViewModel() {
    var state by mutableStateOf(TestState())

    fun getData() {
        viewModelScope.launch {
            val res = interactor.getProductsUseCase.run()
            Log.d("TAG", "getDate: $res")
            this@TestVM.state = this@TestVM.state.copy(product = res)
            //state.product=res.body()!!
        }
    }

}