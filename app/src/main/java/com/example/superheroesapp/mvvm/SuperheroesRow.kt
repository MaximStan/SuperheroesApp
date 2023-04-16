package com.example.superheroesapp.mvvm

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superheroesapp.ui.theme.GreenCustom
import com.example.superheroesapp.ui.theme.Roboto
import com.example.superheroesapp.ui.theme.Shapes

@Composable
fun SuperheroRow(item_Prm: SuperheroItemModel){

    Row(
        modifier = Modifier

            .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
            .clip(shape = Shapes.small)
            .fillMaxWidth()
            .background(color = MaterialTheme.colors.surface),

    ) {
        Column( modifier = Modifier
            .padding(start = 16.dp, top = 9.dp)
            .weight(1f)

        ) {

            Text(text =  item_Prm.title,
                modifier = Modifier.padding(start = 7.dp, top = 7.dp),
                style = MaterialTheme.typography.h2
            )

            Text( text = item_Prm.content,
                modifier = Modifier.padding(start = 7.dp, top = 7.dp),
                style = MaterialTheme.typography.body1
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
                .clip(shape = Shapes.small)

        )



    }

}

