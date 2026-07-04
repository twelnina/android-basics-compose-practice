package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {
    var currentStep by remember { mutableIntStateOf(1) }
//    var squeezeStep = (2..4).random()
    var squeezeStep by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name), fontWeight = FontWeight.Bold
                    )
                }, colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }, modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Surface(
            modifier = modifier.padding(innerPadding)
        ) {
            when (currentStep) {
                1 -> LemonTextAndImage(
                    stringResourceId = R.string.desc_select,
                    imageResourceId = R.drawable.lemon_tree,
                    onClickFunction = {
                        currentStep = 2
                        squeezeStep = (2..4).random()
                    }
                )

                2 -> LemonTextAndImage(
                    stringResourceId = R.string.desc_squeeze,
                    imageResourceId = R.drawable.lemon_squeeze,
                    onClickFunction = {
                        squeezeStep--
                        if (squeezeStep == 0) {
                            currentStep = 3
                        }
                    }
                )

                3 -> LemonTextAndImage(
                    stringResourceId = R.string.desc_drink,
                    imageResourceId = R.drawable.lemon_drink,
                    onClickFunction = {
                        currentStep = 4
                    }
                )

                4 -> LemonTextAndImage(
                    stringResourceId = R.string.desc_restart,
                    imageResourceId = R.drawable.lemon_restart,
                    onClickFunction = {
                        currentStep = 1
                        squeezeStep = (2..4).random()
                    }
                )
            }
        }
    }
}

@Composable
fun LemonTextAndImage(
    stringResourceId: Int,
    imageResourceId: Int,
    onClickFunction: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
            onClick = onClickFunction,
            modifier = Modifier.size(200.dp),
            shape = RoundedCornerShape(32.dp),
            color = Color(0XFFD4E8DB)
        ) {
            Image(
                painter = painterResource(imageResourceId),
                contentDescription = "A lemon tree",
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
            )
        }
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = stringResource(stringResourceId),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeAppPreview() {
    LemonadeTheme(dynamicColor = false) {
        LemonadeApp()
    }
}