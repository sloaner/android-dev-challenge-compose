package com.example.androiddevchallenge.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.adoptableDogs
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DogDetail(dogId: Int?, navController: NavController?, modifier: Modifier = Modifier) {
    val dog = adoptableDogs.first { it.id == dogId ?: 0 }
    val scrollState = rememberScrollState(0)
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(dog.name)
                },
                navigationIcon = {
                    IconButton(onClick = fun() { navController?.popBackStack() }) {
                        Icon(Icons.Rounded.ArrowBack, contentDescription = "Back")
                    }
                },
                elevation = 0.dp,
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = contentColorFor(backgroundColor = MaterialTheme.colors.surface)
            )
        },
        content = {
            Column(modifier = Modifier.fillMaxSize()) {
                BoxWithConstraints(modifier = Modifier.weight(1f)) {
                    Column(
                        Modifier
                            .fillMaxSize()
                            .verticalScroll(state = scrollState)
                    ) {
                        DetailImage(
                            scrollState,
                            dog,
                            this@BoxWithConstraints.maxHeight
                        )
                        Column(Modifier.padding(20.dp, 0.dp, 20.dp, 30.dp)) {
                            Text(
                                "Age: ${dog.age}",
                                style = MaterialTheme.typography.h6
                            )
                            Text(
                                "Gender: ${dog.gender}",
                                style = MaterialTheme.typography.h6
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Text(
                                dog.description,
                                style = MaterialTheme.typography.body1
                            )
                        }
                    }
                }
            }
        }
    )
}


@Composable
private fun DetailImage(
    scrollState: ScrollState,
    dog: Dog,
    containerHeight: Dp
) {
    val offset = (scrollState.value / 2)
    val offsetDp = with(LocalDensity.current) { offset.toDp() }

    Surface(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
            .padding(top = offsetDp),
        shape = RectangleShape,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
    ) {
        CoilImage(
            data = dog.image,
            contentDescription = "",
            contentScale = ContentScale.Crop
        ) {
        }
    }
}

@Preview
@Composable
fun DetailPreview() {
    MyTheme {
        DogDetail(1, null)
    }
}