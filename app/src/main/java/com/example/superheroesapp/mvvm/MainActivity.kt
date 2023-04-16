package com.example.superheroesapp.mvvm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superheroesapp.ui.theme.SuperheroesAppTheme

import com.example.superheroesapp.ui.theme.YellowCustom

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SuperheroesAppTheme{

                Scaffold(
                    topBar = {
                        TopAppBar( modifier = Modifier.height(72.dp),
                            title = { Text( text = "Superheroes",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )
                            },

                            backgroundColor = MaterialTheme.colors.background,

                            )
                    }
                ) {
                    LazyColumn(

                        modifier = Modifier
                            .padding( top = 8.dp, bottom = 8.dp)
                            .fillMaxSize()
                            .background(color = MaterialTheme.colors.background),
                    ) {
                        items(SuperheroesRepository.listOfHeroes){ item ->
                            SuperheroRow(item_Prm = item)

                        }

                    }


                }




            }



        }
    }
}







