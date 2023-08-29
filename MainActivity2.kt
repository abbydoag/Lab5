package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen2()
                }
            }
        }
    }
}

@Composable
fun Screen2(modifier: Modifier = Modifier) {
    val imageResId = R.drawable.photo4
    Column(
        modifier = modifier.fillMaxSize()){
        Icon(
            Icons.Outlined.Settings,
            contentDescription = "settings_icon",
            modifier = modifier
                .size(34.dp)
                .align(Alignment.End)
                .padding(0.dp,2.dp,4.dp),
            tint = Color.DarkGray
        )
        Text(
            text = "My Profile",
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
                .padding(0.dp,4.dp),
            textAlign = TextAlign.Center
        )

        Box{
            val profile = R.drawable.profile
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "Background",
                modifier = modifier
                    .alpha(0.7f),
                contentScale = ContentScale.FillWidth
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp)
                    .background(Color.White)
                    .align(Alignment.BottomCenter)
            )
            Image(
                painter = painterResource(id = profile),
                contentDescription = "Aerial_profilepicture",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(140.dp)
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .border(
                        BorderStroke(4.dp, Color.Cyan), CircleShape
                    )
                )
        }
        Text(
            text = "Abby Sofia Donis Agreda",
            fontWeight = FontWeight.SemiBold,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp)
        )
        Box(modifier = modifier.padding(vertical = 8.dp)){
            Row(modifier = modifier.align(Alignment.BottomStart)){
                Icon(Icons.Outlined.DateRange,
                    contentDescription = "horario",
                    tint = Color(81,165,45),
                    modifier = modifier
                    .align(Alignment.CenterVertically)
                    .padding(11.dp,0.dp,14.dp,3.dp)
                    .size(50.dp)
                )
                Text(
                    text = "Eventos",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Box(modifier = modifier.padding(vertical = 8.dp)){
            Row{
                Icon(Icons.Outlined.Star,
                    contentDescription = "destacado",
                    tint = Color(243,231,57),
                    modifier = modifier
                    .align(Alignment.CenterVertically)
                    .padding(11.dp,0.dp,14.dp,3.dp)
                    .size(50.dp)
                )
                Text(
                    text = "Destacados",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Box(modifier = modifier.padding(vertical = 8.dp)){
            Row{
                Icon(Icons.Outlined.MailOutline ,
                    contentDescription = "mensaje",
                    tint = Color(125,173,255),
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp,0.dp,14.dp,3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Mensajes",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Box(modifier = modifier.padding(vertical = 8.dp)){
            Row{
                Icon(Icons.Outlined.Favorite,
                    contentDescription = "me gusta",
                    tint = Color.Red,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp,0.dp,14.dp,3.dp)
                        .size(50.dp)
                )
                Text(
                    text = "Me gusta",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 9.dp)
                )
            }
        }
        Box(modifier = modifier.padding(vertical = 8.dp)){
            Row{
                Icon(Icons.Outlined.List,
                    contentDescription = "guardados",
                    tint = Color(80,208,186),
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp,0.dp,14.dp,3.dp)
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
    }
}

@Preview(showBackground = true)
@Composable
fun Screen2Preview() {
    Lab4Theme {
        Screen2()
    }
}