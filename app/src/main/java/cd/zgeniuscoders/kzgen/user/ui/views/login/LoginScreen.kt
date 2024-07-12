package cd.zgeniuscoders.kzgen.user.ui.views.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cd.zgeniuscoders.kzgen.Colors
import cd.zgeniuscoders.kzgen.Routes
import cd.zgeniuscoders.kzgen.user.ui.views.components.TextFieldComponent


@Composable
fun LoginScreen(navController: NavHostController) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var rememberMe by remember {
        mutableStateOf(false)
    }

    Surface {

        Column {
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Colors.green
                ),
                shape = RoundedCornerShape(0.dp)
            ) {

            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                "Log In", fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                "Welcome back! Don't have an account?",
                modifier = Modifier.padding(horizontal = 10.dp), fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "Sign up",
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .clickable {
                        navController.navigate(Routes.register.route)
                    },
                fontSize = 18.sp,
                color = Colors.green
            )

            Spacer(modifier = Modifier.height(30.dp))

            TextFieldComponent(textValue = email, label = "Email") {
                email = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            TextFieldComponent(textValue = password, label = "Password") {
                password = it
            }


            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 10.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Colors.green
                )
            ) {
                Text("Log in")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        modifier = Modifier.padding(start = 0.dp),
                        checked = rememberMe,
                        onCheckedChange = { rememberMe = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Colors.green
                        )
                    )
                    Text("Remember me", color = Colors.green)
                }

                Text("Forgot Password?", color = Colors.green)

            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}