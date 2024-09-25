package com.example.testtest

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testtest.ui.theme.TesttestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesttestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Ticket(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun login1(name: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()){
        Text(
            text = "RoomEase",
            style = MaterialTheme.typography.headlineLarge
        )

        Image(
            painter = painterResource(id = R.drawable.logo), // Replace with your image resource
            contentDescription = "Description of the image", // Provide a description for accessibility
            modifier = Modifier.size(256.dp) // Set the size of the image
        )

        Column (
            Modifier
                .padding(16.dp)           // Apply padding
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,){

            Text(
                text = "Log in",
                modifier = Modifier
                    .padding(bottom = 16.dp),
                style = MaterialTheme.typography.headlineMedium
            )

            Button(onClick = { /*TODO*/ } , modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFF141218)
                )){
                Text(text = "Student" ,
                style = MaterialTheme.typography.titleMedium)

            }
            OutlinedButton(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
                border = BorderStroke(1.dp, Color(0xFFEFC176))
            )
            {
                Text(text = "Employee",
                style = MaterialTheme.typography.titleMedium)
            }
        }


    }

}


@Composable
fun login2(name: String, modifier: Modifier = Modifier) {
    val textStateMail = remember { mutableStateOf("") }
    val textStatePass = remember { mutableStateOf("") }
    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()){
        Text(
            text = "RoomEase",
            style = MaterialTheme.typography.headlineLarge
        )

        Image(
            painter = painterResource(id = R.drawable.logo), // Replace with your image resource
            contentDescription = "Description of the image", // Provide a description for accessibility
            modifier = Modifier.size(256.dp) // Set the size of the image
        )

        Column (
            Modifier
                .padding(16.dp)           // Apply padding
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){

            OutlinedTextField(
                value = textStateMail.value, // Current value of the text field

                onValueChange = { newText -> textStateMail.value = newText }, // Update state when text changes
                label = { Text("Enter your Email") }, // Label for the text field
                placeholder = { Text("Enter your Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )
            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("Enter your Password") }, // Label for the text field
                placeholder = { Text("Enter your Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )

            Button(onClick = { /*TODO*/ } , modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFF141218)
                )){
                Text(text = "Submit" ,
                    style = MaterialTheme.typography.titleMedium)

            }

        }


    }

}



@Composable
fun Newticket(name: String, modifier: Modifier = Modifier) {
    val textStateMail = remember { mutableStateOf("") }
    val textStatePass = remember { mutableStateOf("") }

    var expanded by remember { mutableStateOf(false) }
    val items = listOf("Option 1", "Option 2", "Option 3")  // Menu items
    var selectedIndex by remember { mutableStateOf(0) }

    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()){
        Text(
            text = "New Ticket",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(start = 16.dp)
        )

        Column (Modifier
            // Apply padding
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){

            OutlinedTextField(
                value = textStateMail.value, // Current value of the text field

                onValueChange = { newText -> textStateMail.value = newText }, // Update state when text changes
                label = { Text("Select Service") }, // Label for the text field
                placeholder = { Text("Select Service") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )


            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("Enter your Contact Number") }, // Label for the text field
                placeholder = { Text("Enter your Contact Number") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )
            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("Hostel Block") }, // Label for the text field
                placeholder = { Text("Hostel Block") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )


            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("Room Number") }, // Label for the text field
                placeholder = { Text("Room Number") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )

            Button(onClick = { /*TODO*/ } , modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFF141218)
                )){
                Text(text = "Submit" ,
                    style = MaterialTheme.typography.titleMedium)

            }

        }


    }

}




@Composable
fun ProfileScreen(name: String, modifier: Modifier = Modifier) {
    val textStateMail = remember { mutableStateOf("") }
    val textStatePass = remember { mutableStateOf("") }

    var expanded by remember { mutableStateOf(false) }
    val items = listOf("Option 1", "Option 2", "Option 3")  // Menu items
    var selectedIndex by remember { mutableStateOf(0) }

    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(28.dp)
            .fillMaxSize()){
        Text(
            text = "Profile",
            style = MaterialTheme.typography.headlineLarge
        )

        Image(
            painter = painterResource(id = R.drawable.genericavatar), // Replace with your image resource
            contentDescription = "Description of the image", // Provide a description for accessibility
            modifier = Modifier.size(80.dp) // Set the size of the image
        )

        Column (Modifier
            // Apply padding
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly){

            OutlinedTextField(
                value = textStateMail.value, // Current value of the text field

                onValueChange = { newText -> textStateMail.value = newText }, // Update state when text changes
                label = { Text("Raghav Sharma") }, // Label for the text field
                placeholder = { Text("Raghav Sharma") },
                enabled = false,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )

            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("23BCI0008") }, // Label for the text field
                placeholder = { Text("23BCI0008") },
                enabled = false,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )

            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("801293442") }, // Label for the text field
                placeholder = { Text("801293442") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )


            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field

                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("MH-C") }, // Label for the text field
                placeholder = { Text("MH-C") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )


            OutlinedTextField(
                value = textStatePass.value, // Current value of the text field
                onValueChange = { newText -> textStatePass.value = newText }, // Update state when text changes
                label = { Text("420") }, // Label for the text field
                placeholder = { Text("420") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),// Fill the available width
            )



        }


    }

}


@Composable
fun Ticket(name: String, modifier: Modifier = Modifier) {
    Card (
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                containerColor = Color(0xFF28262B),
    )    ) {
        Text(text = "In Progress",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(8.dp) ,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFA4EF76)
        )
        Text(text = "Cleaning",
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
        )
        Text(text = "Booked on: 18/9/24, 18:08",
            modifier = Modifier.padding(8.dp)
        )
        Text(text = "Booked for: 19/9/24, 1200 - 1500 hrs",
            modifier = Modifier.padding(8.dp)
        )
        Text(text = "Room: C420",
            modifier = Modifier.padding(8.dp, bottom = 16.dp),
            color = Color(0xFFEFC176)
        )
    }

}
