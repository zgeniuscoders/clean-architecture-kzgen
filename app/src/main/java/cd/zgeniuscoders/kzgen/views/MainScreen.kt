package cd.zgeniuscoders.kzgen.views

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cd.zgeniuscoders.kzgen.Colors
import cd.zgeniuscoders.kzgen.Routes
import cd.zgeniuscoders.kzgen.SetupMainNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Surface {
        val items = listOf(
            BottomNavigationItem(
                title = "Home",
                selectedIcon = Icons.Filled.Home,
                unSelectedIcon = Icons.Outlined.Home,
                route = Routes.home.route
            ),
            BottomNavigationItem(
                title = "Products",
                selectedIcon = Icons.Filled.ShoppingCart,
                unSelectedIcon = Icons.Outlined.ShoppingCart,
                route = Routes.products.route
            ),
            BottomNavigationItem(
                title = "Notifications",
                selectedIcon = Icons.Filled.Notifications,
                unSelectedIcon = Icons.Outlined.Notifications,
                route = Routes.notifications.route,
            ),
            BottomNavigationItem(
                title = "Settings",
                selectedIcon = Icons.Filled.Settings,
                unSelectedIcon = Icons.Outlined.Settings,
                route = Routes.settings.route,
            ),
        )

        var selectedItemIndex by rememberSaveable {
            mutableIntStateOf(0)
        }

        Scaffold(
            bottomBar = {
                NavigationBar {
                    items.forEachIndexed { index, bottomNavigationItem ->
                        NavigationBarItem(
                            selected = selectedItemIndex == index,
                            colors = NavigationBarItemDefaults.colors(
                                indicatorColor = Colors.green
                            ),
                            onClick = {
                                selectedItemIndex = index
                                navController.navigate(items[index].route)
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
            SetupMainNavGraph(navHostController = navController)
        }

    }
}

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val route: String
)

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController = navController)
}