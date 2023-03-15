package com.example.superheroesapp.mvvm

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superheroesapp.ui.theme.GreenCustom

@Composable
fun SuperheroRow(item_Prm: SuperheroItemModel){

    Row(

        modifier = Modifier
            .padding(10.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(color = GreenCustom)


    ) {
        Column( modifier = Modifier.padding(start = 7.dp, top = 9.dp)
            .weight(1f)


        ) {

            Text(text =  item_Prm.title,
                modifier = Modifier.padding(start = 7.dp, top = 7.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text( text = item_Prm.content,
                modifier = Modifier.padding(start = 7.dp, top = 7.dp),
                fontWeight = FontWeight.W800,
                fontSize = 14.sp
                )
            
        }


        Image(
            painter = painterResource
                (id  =
            item_Prm.imageId),
            contentDescription = null,
            modifier = Modifier
                .padding(9.dp)
                .size(65.dp)
                .clip(shape = RoundedCornerShape(15.dp))

        )



    }

}

//fun SuperheroRow(item_Prm: SuperheroesRepository){
//
//    Row(
//        modifier = Modifier
//            .padding(5.dp)
//            .fillMaxWidth()
//            .background(color = GreenCustom)
//            .clip(shape = RoundedCornerShape(15.dp))
//
//    ) {
//        Text(text =  item_Prm.listOfHeroes[item_Prm.listOfHeroes.size - 1].title,
//             modifier = Modifier
//                 .weight(1f),
//            fontWeight = FontWeight.Bold,
//        fontSize = 20.sp
//
//        )
//
//        Image(
//              painter = painterResource
//                  (id =
//              item_Prm.listOfHeroes[item_Prm.listOfHeroes.size - 1].imageId),
//              contentDescription = null,
//             modifier = Modifier
//                 .padding(3.dp)
//
//        )
//
//
//
//    }
//
//}