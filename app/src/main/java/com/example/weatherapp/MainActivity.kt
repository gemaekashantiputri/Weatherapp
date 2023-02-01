package com.example.weatherapp

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.WeatherAppTheme
import com.example.weatherapp.ui.theme.blacktext90

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WeatherPage("Android")
                }
            }
        }
    }
}

@Composable
fun WeatherPage(name: String) {
    Column( modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        HeaderImage()
        MainInfo()
        circle()
        ilustrate()
    }
}

@Composable
fun HeaderImage() {
    Image(painter = painterResource(id = R.drawable.ic_glass),
        contentDescription = null,
        modifier = Modifier
            .widthIn(2000.dp)
            .offset(y = (-50).dp)
            .fillMaxWidth()
            .padding(12.dp)
    )
}

@Composable
fun MainInfo() {
    Text(text = "Banyumas, Indonesia", color = blacktext90,
        modifier = Modifier
            .offset(y = (-310).dp)
    )
    Text(text = "Today", color = blacktext90,
        modifier = Modifier
            .offset(y = (-300).dp)
    )
    Text(text = "Temperature", color = blacktext90,
        modifier = Modifier
            .offset(y = (-250).dp)
            .offset(x = (-100).dp)
        )
    Text(text = "Wind Speed", color = blacktext90,
        modifier = Modifier
            .offset(y = (-200).dp)
            .offset(x = (-100).dp)
    )

}

@Composable
fun circle() {
    Image(painter = painterResource(id = R.drawable.ic_circle),
        contentDescription = null,
        modifier = Modifier
            .width(1000.dp)
            .offset(x = (100).dp)
            .offset(y = (-200).dp)
    )
}

@Composable
fun ilustrate() {
    Image(painter = painterResource(id = R.drawable.ic_rain),
        contentDescription = null,
        modifier = Modifier
            .offset(y = (-150).dp)
        )
    Image(painter = painterResource(id = R.drawable.ic_iconrain), contentDescription = null,
        modifier = Modifier
            .offset(y = (-500).dp)
            .offset(x = (100).dp),
    )
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
        WeatherPage("Android")
    }
}