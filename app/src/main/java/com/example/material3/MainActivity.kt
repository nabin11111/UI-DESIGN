package com.example.material3


import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Divider
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),


                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.Top,


                ) {
                Text(
                    text = "facebook           ",

                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 40.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.ExtraBold

                    )
                )
////here
                Row {


                    Box(
                        modifier = Modifier
                            .background(
                                color = Color.White
                            )
                            .size(45.dp)
                            .fillMaxSize()
                            .border(width = 1.dp, color = Color.Black, shape = CircleShape)


                    )


                    Box(
                        modifier = Modifier
                            .border(width = 1.dp, color = Color.Black, shape = RectangleShape)

                            .size(45.dp)
                    )


                    Box(

                        modifier = Modifier
                            .border(width = 1.dp, color = Color.Black, shape = RectangleShape)
                            .size(45.dp)
                            .fillMaxSize()

                    )


                }


            }


            //here
            Column(

                modifier = Modifier
                    .padding(top = 80.dp)

            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    repeat(6) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color.White)
                                .shadow(1.dp)


                        )


                    }
                }
            }


//nnnnnnnnnn


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(top = 150.dp)
            ) {
                // First Box with Image
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.White)

                )
                {
                    // Image goes here
                    Image(
                        painter = painterResource(id = R.drawable.facebook), // Replace with your image resource
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit
                    )
                }

                // Second Box with Search Bar
                Box(
                    modifier = Modifier
                        .weight(2f)
                        .background(Color.White)
                        .width(150.dp)
                        .height(100.dp)
                        .border(width = 1.dp, Color.Black, shape = RectangleShape)
                ) {
                    // Search Bar goes here

                }

                // Third Box with Image
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(
                            Color.White
                        )

                ) {
                    // Image goes here


                    Image(
                        painter = painterResource(id = R.drawable.facebook), // Replace with your image resource
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Fit,


                        )


                }
            }
            //mmm

            Column(

                modifier = Modifier
                    .padding(top = 230.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    repeat(16) {
                        Box(
                            modifier = Modifier
                                .size(140.dp)
                                .background(Color.White)
                                .shadow(elevation = 10.dp)
                                .verticalScroll(rememberScrollState())

                        )


                    }


                }
            }
            val imageList= listOf(
                R.drawable.facebook, // Replace with your image resources
                R.drawable.facebook,
                R.drawable.facebook,
                R.drawable.facebook,
                R.drawable.facebook,
                R.drawable.facebook,
                R.drawable.facebook,
                R.drawable.facebook
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 0.001.dp, top = 390.dp)
                    .verticalScroll(rememberScrollState())




            ) {
                for (imageResource in imageList) {
                    Box(
                        modifier = Modifier
                            .border(width = 1.dp, color = Color.White, shape = RectangleShape)
                            .width(100.dp)
                            .height(100.dp)
                            .align(Alignment.Start)




                    )  {


                        Image(
                            painter = painterResource(id = imageResource),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )
                        
                            // Image goes her

                    }
                }


            }





        }







        }

    }

















