package com.wi_sunbleapp.chat.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.wi_sunbleapp.chat.model.Message


@Composable
fun MessageBox(message: Message) {

    val alignment = if(message.sender == "android") Alignment.CenterEnd else Alignment.CenterStart
    val containerColor = if (message.sender == "android") Color(0xFFE0F7FA) else Color(0xFFF1F8E9)
    val contentColor = if (message.sender == "android") Color(0xFF004D40) else Color(0xFF33691E)


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        contentAlignment = alignment
    ){

        Box(
            modifier = Modifier
                .widthIn(max = 270.dp)
                .background(containerColor, RoundedCornerShape(10.dp))
        ){

            Text(
                text = message.content,
                color = Color.Black,
                modifier = Modifier
                    .padding(5.dp)
            )

        }

    }

}