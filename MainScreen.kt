package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent (){
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier) {
    val button1 = LocalContext.current
    val button2 = LocalContext.current
    val button3 = LocalContext.current
    val button4 = LocalContext.current

    Column(modifier = modifier
        .fillMaxSize()) {
        Surface (modifier = modifier
            .fillMaxWidth(),
            color =  Color(190, 234, 239)
        ){
            Text(
                text = "Bienvenido",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )
        }
        val imageMainScreen = R.drawable.baseline_house_24
        Icon(
            painter = painterResource(id = imageMainScreen),
            contentDescription = "Home",
            modifier = modifier
                .size(150.dp)
                .align(Alignment.CenterHorizontally)
                .padding(19.dp),
            tint = Color.LightGray
        )
        Button(onClick ={
            button1.startActivity(Intent(button1, MainActivity::class.java))
        },
            modifier = modifier.align(Alignment.CenterHorizontally)
                .padding(19.dp)
        ){
            Text(text = "Pantalla Principal",
                fontSize = 20.sp)
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Button(onClick ={
            button2.startActivity(Intent(button2, MainActivity2::class.java))
        },
            modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(19.dp)){
            Text(text = "Perfil",
                fontSize = 20.sp)
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Button(onClick ={
            button3.startActivity(Intent(button3, MainActivity3::class.java))
        },
            modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(19.dp)){
            Text(text = "Settings",
                fontSize = 20.sp)
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Button(onClick ={
            button4.startActivity(Intent(button4, MainActivity4::class.java))
        },
            modifier = modifier
            .align(Alignment.CenterHorizontally)
            .padding(19.dp)){
            Text(text = "Contactos de emergencia",
                fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Lab4Theme {
        Home()
    }
}