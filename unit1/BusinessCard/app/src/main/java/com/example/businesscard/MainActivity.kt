package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = Color(0xFFA8C3DB)) { innerPadding ->
                    BusinessCardInfo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardInfo(modifier: Modifier = Modifier) {
    BusinessCard(
        devName = stringResource(R.string.dev_name),
        myName = stringResource(R.string.my_name),
        modifier = modifier
    )
}

@Composable
fun BusinessCard(
    devName: String,
    myName: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(4f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.hsinkkep_400x400),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
            )
            Text(
                text = devName,
                fontSize = 48.sp,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Text(
                text = myName
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
//                .padding(horizontal = 90.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            MyInfo(
                icon = Icons.Default.Phone,
                info = stringResource(R.string.phone)
            )
            MyInfo(
                icon = Icons.Default.Share,
                info = stringResource(R.string.handle)
            )
            MyInfo(
                icon = Icons.Default.Email,
                info = stringResource(R.string.email)
            )
        }
    }
}


@Composable
fun MyInfo(icon: ImageVector, info: String) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.widthIn(min = 215.dp, max = 300.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = info,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 25.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardInfo(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA8C3DB))
        )
    }
}