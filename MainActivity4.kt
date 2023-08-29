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
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen4()
                }
            }
        }
    }
}

@Composable
fun Screen4(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()){
        Icon(
            Icons.Outlined.Close,
            contentDescription = "settings_icon",
            modifier = modifier
                .size(38.dp)
                .align(Alignment.End)
                .padding(0.dp,3.dp,4.dp),
            tint = Color.DarkGray
        )
        Text(
            text = "Contactos de emergencia",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp, 4.dp),
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color(208,208,208))
        )
        Box{
            Row(modifier = modifier.align(Alignment.BottomStart)){
                Icon(
                    Icons.Filled.Warning,
                    contentDescription = "information",
                    tint = Color.Red,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(60.dp)
                )
                Text(
                    text = "Emergencias \n En caso de algun incidente por favor contactar \n al siguiente numero \n 9342-4321",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .padding(vertical = 10.dp)
                )
            }
        }
        Box{
            Row(modifier = modifier.align(Alignment.BottomStart)) {
                Icon(
                    Icons.Filled.AddCircle,
                    contentDescription = "information",
                    tint = Color.Green,
                    modifier = modifier
                        .align(Alignment.CenterVertically)
                        .padding(11.dp, 0.dp, 14.dp, 3.dp)
                        .size(60.dp)
                )
                Text(
                    text = "Clinica \n En caso de emergencia por favor contactar \n al siguiente numero \n 9092-4725",
                    fontSize = 18.sp,
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
fun Screen4Preview() {
    Lab4Theme {
        Screen4()
    }
}