package cd.zgeniuscoders.kzgen.products.ui.views.test

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.getViewModel

@Composable
fun TestPage() {
    val vm = getViewModel<TestVM>()

    LaunchedEffect(Unit) {
        vm.getData()
    }

    TestBody(
        state = vm.state,
        getData = {
            vm.getData()
        })

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview
fun TestBody(
    state: TestState = TestState(),
    getData: () -> Unit = {}
) {

    Scaffold {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(30.dp))
            Text("COUNT : ${state.product.size}")
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = { getData() }) {
                Text("Refresh")
            }
        }

    }
}
