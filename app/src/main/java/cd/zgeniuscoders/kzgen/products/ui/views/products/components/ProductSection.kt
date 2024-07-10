package cd.zgeniuscoders.kzgen.products.ui.views.products.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cd.zgeniuscoders.kzgen.R
import cd.zgeniuscoders.kzgen.products.domain.models.Category
import cd.zgeniuscoders.kzgen.products.domain.models.Product

@Preview(showBackground = true)
@Composable
fun ProductSection() {
    val products = mutableListOf(
        Product("1", Category("1", "choose"), "1", emptyList(), "swift", "des", 10),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
    )

    Column {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Shocking Sale",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                "See All",
                color = Color.Green
            )
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {

            items(products.size) {
                ProductItem(products[it])
            }
        }
    }
}


@Composable
fun ProductItem(product: Product) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.p1),
                contentDescription = "p1l",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(
                        product.name,
                        fontSize = 18.sp
                    )
                    Text(
                        "$${product.price}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }

            }
        }
    }
}