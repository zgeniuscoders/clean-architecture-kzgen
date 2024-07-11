package cd.zgeniuscoders.kzgen.auth.ui.views.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cd.zgeniuscoders.kzgen.Colors
import cd.zgeniuscoders.kzgen.auth.ui.views.components.TextFieldComponent

@Composable
fun RegisterPage(
    navController: NavHostController
) {

    Surface {

        var email by remember {
            mutableStateOf("")
        }

        var username by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }

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
                "Sign up", fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                "Already have an account?",
                modifier = Modifier.padding(horizontal = 10.dp), fontSize = 18.sp,
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "Sign in",
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .clickable {
                        navController.popBackStack()
                    },
                fontSize = 18.sp,
                color = Colors.green
            )

            Spacer(modifier = Modifier.height(30.dp))

            TextFieldComponent(textValue = email, label = "Email") {
                email = it
            }

            Spacer(modifier = Modifier.height(10.dp))

            TextFieldComponent(textValue = username, label = "Username") {
                username = it
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
                Text("Sign up")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterPagePreview(){
    RegisterPage(navController = rememberNavController())
}

