package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen3()
                }
            }
        }
    }
}

@Composable
fun Screen3(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()){
        Icon(
            Icons.Outlined.Close,
            contentDescription = "settings_icon",
            modifier = modifier
                .size(38.dp)
                .align(Alignment.End)
                .padding(0.dp,3.dp,4.dp),
            tint = Color.Black
        )
        Text(
            text = "Settings",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp, 4.dp),
            textAlign = TextAlign.Center
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                Icon(
                    Icons.Outlined.AccountBox,
                    contentDescription = "perfil",
                    tint = Color.Black,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Perfil",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                val icon1 = R.drawable.baseline_bookmark_border_24
                Icon(
                    painter = painterResource(id = icon1),
                    contentDescription = "bookmark",
                    tint = Color(72,181,228),
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Guardados",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                val icon2 = R.drawable.baseline_notifications_24
                Icon(
                    painter = painterResource(id = icon2),
                    contentDescription = "bookmark",
                    tint = Color.Gray,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Notificaciones",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                Icon(
                    Icons.Outlined.Lock,
                    contentDescription = "privacy",
                    tint = Color(239,137,48),
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Privacidad",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(25.dp)
                .background(Color(196,196,196))
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                val icon3 = R.drawable.baseline_help_outline_24
                Icon(
                    painter = painterResource(id = icon3),
                    contentDescription = "help",
                    tint = Color.Red,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "FAQ y ayuda",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(208,208,208))
        )
        Box(modifier = modifier.padding(vertical = 10.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                Icon(
                    Icons.Outlined.Info,
                    contentDescription = "information",
                    tint = Color(20,114,255),
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Información y documentación",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(25.dp)
                .background(Color(196,196,196))
        )
        Text(
            text = "Cerrar Sesión",
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 5.dp),
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Screen3Preview() {
    Lab4Theme {
        Screen3()
    }
}