package com.example.rowcolumnbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rowcolumnbox.ui.theme.RowColumnBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    //ColumnArrangement()
                    //RowArrange(modifier = Modifier)
                    BoxArrange(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun ColumnArrangement() {
    Column() {
        Text(text = "Hello")
        Text(text = "World")
        Text(text = "!!!")
    }
}

@Composable
fun RowArrange(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Bla")
        Text(text = "bla")
        Text(text = "bla")
    }
}


@Composable
fun BoxArrange(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                , contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Hello World", fontSize = 20.sp, textAlign = TextAlign.Center)
                Text(text = "Hello Kotlin", textAlign = TextAlign.Center)
            }
        }
    }
}


