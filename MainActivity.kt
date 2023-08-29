package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.ui.theme.Lab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Screen1("Abby")
                }
            }
        }
    }
}

@Composable
fun Screen1(name:String, modifier: Modifier = Modifier){
    val imageResId = R.drawable.photo1
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            Text(
                text = "¡Hola $name!",
                modifier = modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "RWBY_EverAfter",
                contentScale = ContentScale.FillWidth,
                modifier = modifier
                    .height(270.dp)
            )

            Text(
                text="Destacados",
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold,
                modifier = modifier.padding(6.dp),
                color = Color.Gray
            )
            Row{
                Box(modifier = modifier.height(200.dp))
                {
                   val imageMiddle1 = R.drawable.photo2a
                    Image(
                        painter = painterResource(id = imageMiddle1),
                        contentDescription = "RWBY_Icequeendom",
                        modifier = modifier
                            .size(200.dp)
                            .padding(horizontal = 10.dp)
                    )
                    Text(
                        text = "Nuevo Spin-off",
                        modifier = modifier
                            .align(Alignment.BottomCenter)
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Gray
                                    ),startY = 8f))
                            ,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }
                Box(modifier = modifier.height(200.dp))
                {
                    val imageMiddle2 = R.drawable.photo2b
                    Image(
                        painter = painterResource(id = imageMiddle2),
                        contentDescription = "RWBY_Amity_Arena",
                        modifier = modifier
                            .size(200.dp)
                            .padding(horizontal = 5.dp)
                    )
                    Text(
                        text = "Aniversario de \n Amity Arena",
                        modifier = modifier
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Gray
                            ),startY = 8f)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                }
            }

            Text(
                text = "Nuevo",
                fontSize = 25.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.SemiBold,
                modifier = modifier.padding(6.dp),
                color = Color.Gray
            )
            Row{
                Box{
                    val imageBottom1 = R.drawable.photo3a
                    Image(
                        painter = painterResource(id = imageBottom1),
                        contentDescription = "RWBY_Arrowfell",
                        modifier = modifier
                            .padding(horizontal = 27.dp),
                        contentScale = ContentScale.Fit
                    )
                    Text(
                        text = "Arrowfell llega\n     a Switch",
                        modifier = modifier
                            .align(Alignment.BottomCenter)
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Gray
                                    ),startY = 8f)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        fontSize = 15.sp
                    )
                }
                Box(modifier = modifier.height(200.dp))
                {
                    val imageBottom2 = R.drawable.photo_3b
                    Image(
                        painter = painterResource (id = imageBottom2),
                        contentDescription = "RWBY_10hAnniversary",
                        modifier = modifier
                            .size(200.dp)
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Mercancía 10° Aniversario",
                        modifier = modifier
                            .align(Alignment.BottomCenter)
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Gray
                                    ),startY = 5f)),
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White,
                        fontSize = 15.sp
                    )
                }

            }
        }
}

@Preview(showBackground = true)
@Composable
fun Screen1Preview() {
    Lab4Theme {
        Screen1("Abby")
    }
}