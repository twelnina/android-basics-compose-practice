package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.data.DataSource
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtSpaceApp(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    var currentSpace by remember { mutableIntStateOf(0) }
    val maxSpace = DataSource.Arts.lastIndex

    val item = DataSource.Arts[currentSpace]

    fun updateSpace(increment: Boolean) {
        currentSpace = if (increment) {
            if (currentSpace >= maxSpace) {
                0
            } else currentSpace + 1
        } else {
            if (currentSpace <= 0) {
                maxSpace
            } else currentSpace - 1
        }
    }
    Column(
        modifier = modifier.padding(horizontal = 24.dp)
    ) {
        ArtworkAndTitle(
            drawableResourceId = item.drawableResourceId,
            stringResourceTitleId = item.stringResourceTitleId,
            stringResourceArtistId = item.stringResourceArtistId
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                onClick = { updateSpace(false) },
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Previous"
                )
            }
            Spacer(modifier = Modifier.weight(0.5f))
            Button(
                onClick = { updateSpace(true) },
                modifier = Modifier.weight(1f)

            ) {
                Text(
                    text = "Next",
                )
            }

        }
    }
}

@Composable
fun ArtworkAndTitle(
    drawableResourceId: Int,
    stringResourceTitleId: Int,
    stringResourceArtistId: Int,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.9f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
            color = MaterialTheme.colorScheme.surface,
            shadowElevation = 8.dp,
            shape = RoundedCornerShape(8.dp),

            modifier = Modifier
                .aspectRatio(3f / 4f)
                .fillMaxHeight(0.7f)
        ) {
            Image(
                painter = painterResource(drawableResourceId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            modifier = Modifier
                .background(
                    color = Color(0XFFEEEEEE),
                    shape = RoundedCornerShape(8.dp)
                )
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = stringResource(stringResourceTitleId),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.W200
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(stringResourceArtistId),
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        ArtSpaceApp(
            modifier = Modifier
                .fillMaxSize()
        )
    }
}