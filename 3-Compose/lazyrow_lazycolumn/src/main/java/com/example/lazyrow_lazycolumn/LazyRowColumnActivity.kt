package com.example.lazyrow_lazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazyrow_lazycolumn.ui.theme.RowColumnBoxTheme

class LazyRowColumnActivity : ComponentActivity() {

    private val countries = mutableListOf(
        "Belgium",
        "Germany",
        "Turkey",
        "Denmark",
        "India",
        "Pakistan",
        "Brazil",
        "China",
        "United States",
        "Italy",
        "Norway"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowColumnBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LazyColumnView()
                    //LazyRowView()
                }
            }
        }
    }

    @Composable
    fun LazyColumnView() {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)

        ) {
            items(countries) { country ->
                Text(
                    text = country,
                    style = TextStyle(
                        fontSize = 50.sp,
                        color = Color.Blue,
                        fontStyle = FontStyle.Italic
                    )
                )
            }
        }
    }

    @Composable
    fun LazyRowView() {
        LazyRow(
            contentPadding = PaddingValues(vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(countries) { country ->
                Text(
                    text = country,
                    style = TextStyle(
                        fontSize = 25.sp,
                        color = Color.Red,
                        fontStyle = FontStyle.Normal
                    )
                )
            }
        }
    }


}

