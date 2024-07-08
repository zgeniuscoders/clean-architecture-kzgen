package cd.zgeniuscoders.kzgen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import cd.zgeniuscoders.kzgen.products.domain.usecases.ProductInteractor
import cd.zgeniuscoders.kzgen.products.ui.framework.ProductServiceImpl
import cd.zgeniuscoders.kzgen.products.ui.views.test.TestPage
import cd.zgeniuscoders.kzgen.ui.theme.KzgenTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()


        setContent {
            KzgenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                   TestPage()
                }
            }
        }
    }
}

@Composable
fun header() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(text = "Hello", fontSize = 18.sp)
                Text(text = "zgeniuscoders", fontSize = 20.sp)
            }

            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "hello",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KzgenTheme {
        header()
    }
}