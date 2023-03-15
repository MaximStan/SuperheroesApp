package com.example.superheroesapp.mvvm

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.ui.theme.YellowCustom

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "Superheroes") },
                        backgroundColor = Color.Magenta,

                    )
                }
            ) {
                LazyColumn(

                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = YellowCustom),
                ) {
                    items(SuperheroesRepository.listOfHeroes){ item ->
                        SuperheroRow(item_Prm = item)

                    }

                }


            }


        }
    }
}








//            Row( verticalAlignment = Alignment.Top,
//                 horizontalArrangement = Arrangement.Center,
//
//                 modifier = Modifier
//                     .fillMaxWidth()
//                     .background(Color.Magenta)
//                     .size(height = 56.dp, width = 100.dp)
//
//
//            ){
//                Text(
//                    text = AppText(),
//                   // modifier = Modifier.align(Alignment.CenterHorizontally)
//
//                )
//
//
//            }

//
//            LazyColumn(
//
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(color = YellowCustom),
//            ) {
//                items(SuperheroesRepository.listOfHeroes){ item ->
//                   SuperheroRow(item_Prm = item)
//
//                }
//
//                }
//
//            }
//        }
//    }



