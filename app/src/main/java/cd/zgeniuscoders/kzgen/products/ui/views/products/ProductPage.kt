package cd.zgeniuscoders.kzgen.products.ui.views.products

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cd.zgeniuscoders.kzgen.R
import cd.zgeniuscoders.kzgen.products.domain.models.Category
import cd.zgeniuscoders.kzgen.products.domain.models.Product
import cd.zgeniuscoders.kzgen.products.ui.views.products.components.CardItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun ProductPage() {

    val scrollState = rememberScrollState()
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
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
        Product("1", Category("1", "choose"), "1", emptyList(), "swift nike", "des", 120),
    )

    var items = listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unSelectedIcon = Icons.Outlined.Home,
        ),
        BottomNavigationItem(
            title = "Products",
            selectedIcon = Icons.Filled.ShoppingCart,
            unSelectedIcon = Icons.Outlined.ShoppingCart,
        ),
        BottomNavigationItem(
            title = "Notifications",
            selectedIcon = Icons.Filled.Notifications,
            unSelectedIcon = Icons.Outlined.Notifications,
        ),
        BottomNavigationItem(
            title = "Settings",
            selectedIcon = Icons.Filled.Settings,
            unSelectedIcon = Icons.Outlined.Settings,
        ),
    )

    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, bottomNavigationItem ->
                    NavigationBarItem(
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index
                        }, icon = {
                            Icon(
                                imageVector = if (selectedItemIndex == index) {
                                    items[index].selectedIcon
                                } else {
                                    items[index].unSelectedIcon
                                },
                                contentDescription = items[index].title
                            )
                        }
                    )
                }
            }
        }
    ) {



        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
        ) {

            item {
                HeaderSection()
            }

            item {
                LazyRow {
                    items(4) {
                        CardItem()
                    }
                }
            }

            item {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .height(600.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    items(products.size) { it ->
                        ProductItem(product = products[it])
                    }
                }
            }

        }

    }

}

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector
)


@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text("Welcome Back")
            Text(
                "Rostam Sadigi", fontSize = 18.sp, fontWeight = FontWeight.Medium
            )
        }

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "hello",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )
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



