package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreeting("Aum", from="Amit")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreeting(name: String, from: String) {
    Surface(color = Color.Magenta){
         Column{
            Text(text = "Happy Birthday $name!", modifier = Modifier.padding(24.dp), fontSize = 20.sp)
            Text(text = "From $from", fontSize = 20.sp)
        }
    }
}

@Composable
fun fancyButton(){

}
@Preview(showBackground = true)
@Composable
fun BirthdayGreetingPreview() {
    GreetingCardTheme {
        BirthdayGreeting("Aum", from="Amit")
    }
}