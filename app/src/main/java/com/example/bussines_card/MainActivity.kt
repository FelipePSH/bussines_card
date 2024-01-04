package com.example.bussines_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussines_card.ui.theme.Bussines_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val image = painterResource(id = R.drawable.compose_android_logo)
            Bussines_cardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Header(
                        fullName = "Felipe Pereira dos Santos",
                        image = image,
                        jobTitle = "Android Developer"
                    )
                    Contacts()
                }
            }
        }
    }
}

@Composable
fun Header(fullName: String, image: Painter, jobTitle: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = "Android Logo"
        )
        Text(
            text = fullName,
            fontSize = 24.sp,
        )
        Text(
            text = jobTitle,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun Contacts(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier.padding(16.dp).fillMaxWidth()
    ) {
        Row(modifier = modifier.padding(6.dp)) {
            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
            Spacer(modifier = Modifier.padding(6.dp))
            Text(text = "FelipePSH")
        }
        Row(modifier = modifier.padding(6.dp)) {
            Icon(imageVector = Icons.Default.Phone, contentDescription = null)
            Spacer(modifier = Modifier.padding(6.dp))
            Text(text = "+61 0419 283 439")
        }
        Row(modifier = modifier.padding(6.dp)) {
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
            Spacer(modifier = Modifier.padding(6.dp))
            Text(text = "felipe.au.pereira.santos@gmail.com")
        }

        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = "since - 2020",
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Bussines_cardTheme {
        val image = painterResource(id = R.drawable.compose_android_logo)
        Header(
            fullName = "Felipe Pereira dos Santos",
            image = image,
            jobTitle = "Pleno Android Developer"
        )
        Contacts()
    }
}