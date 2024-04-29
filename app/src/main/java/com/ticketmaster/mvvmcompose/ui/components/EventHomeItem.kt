package com.ticketmaster.mvvmcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.ticketmaster.mvvmcompose.R
import com.ticketmaster.mvvmcompose.ui.theme.BasicDarkerGray
import com.ticketmaster.mvvmcompose.ui.theme.BasicWhite
import com.ticketmaster.mvvmcompose.ui.theme.PrimaryDarkNavy
import com.ticketmaster.mvvmcompose.ui.theme.PrimaryRed
import com.ticketmaster.mvvmcompose.ui.theme.WorkSansFamily

@Preview
@Composable
fun UpcomingCardComponent() {
    Row(
        modifier = Modifier.fillMaxWidth().height(190.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                text = "APR",
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                color = PrimaryRed
            )
            Text(
                text = "2024",
                fontWeight = FontWeight.Bold,
                fontSize = 8.sp,
                color = PrimaryRed
            )
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                modifier = Modifier.size(40.dp, 56.dp),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "29",
                        fontFamily = WorkSansFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryDarkNavy
                    )
                    Text(
                        text = "MON",
                        fontFamily = WorkSansFamily,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = BasicDarkerGray
                    )
                }
            }
            Spacer(modifier = Modifier.height(6.dp).size(2.dp, 240.dp))
            Image(
                painter = painterResource(id = R.drawable.scroll_upcoming),
                contentDescription = null,
            )
        }
        Card(
            modifier = Modifier
                .weight(1f)
                .height(172.dp)
                .clickable { },
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                AsyncImage(
                    model = "",
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                        .alpha(0.9f)
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "",
                        fontFamily = WorkSansFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = BasicWhite,
                        maxLines = 3
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_upcoming_music),
                            contentDescription = null,
                            modifier = Modifier.size(19.dp)
                                .alpha(0.7f),
                            tint = BasicWhite
                        )
                            Text(
                                text = "",
                                modifier = Modifier
                                    .alpha(0.7f)
                                    .padding(end = 12.dp),
                                fontFamily = WorkSansFamily,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = BasicWhite,
                                maxLines = 1
                            )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_upcoming_price),
                            contentDescription = null,
                            modifier = Modifier
                                .alpha(0.7f)
                                .padding(end = 3.dp),
                            tint = BasicWhite
                        )
                        Text(
                            text = "€${""} - €${""}",
                            modifier = Modifier.alpha(0.7f),
                            fontFamily = WorkSansFamily,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = BasicWhite
                        )
                    }
                }
            }
        }
    }
}
