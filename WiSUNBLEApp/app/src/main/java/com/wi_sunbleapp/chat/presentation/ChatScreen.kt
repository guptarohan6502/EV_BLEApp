package com.wi_sunbleapp.chat.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.wi_sunbleapp.chat.model.Message
import com.wi_sunbleapp.chat.presentation.components.MessageBox


@Composable
fun ChatScreen() {


    val testMessage = listOf<Message>(
        Message(
            content = "Hello Arduino",
            timestamp = 1324645,
            sender = "android"
        ),
        Message(
            content = "This is a test",
            timestamp = 1324645,
            sender = "arduino"
        ),
        Message(
            content = "Okay",
            timestamp = 1324645,
            sender = "android"
        )
    )


    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            //here will have the buttons connection and the sign




        },
        bottomBar = {
            //here will have the input and send icon
        }
    ) { innerPadding ->


        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {

            items(testMessage){ message ->

                MessageBox(message)
            }

        }

    }

}