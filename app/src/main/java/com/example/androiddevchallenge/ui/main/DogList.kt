package com.example.androiddevchallenge.ui.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.model.Dog
import com.example.androiddevchallenge.model.adoptableDogs
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DogList(dogs: List<Dog>, navController: NavController?, modifier: Modifier = Modifier) {
    val scrollState = rememberLazyListState()

    LazyColumn(Modifier.fillMaxWidth(), state = scrollState) {
        items(dogs) { dog ->
            DogRow(dog = dog, navController = navController)
        }
    }
}

@Composable
fun DogRow(dog: Dog, navController: NavController?, modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .clickable(onClick = { navController?.navigate("detail/${dog.id}") })
            .padding(16.dp)
    ) {
        dog.image?.let { image ->
            Surface(
                modifier = Modifier.size(50.dp),
                shape = CircleShape,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
            ) {
                CoilImage(
                    data = image,
                    contentDescription = "Android Logo",
                    contentScale =  ContentScale.Crop,
                    modifier = Modifier.size(50.dp),
                    loading = {
                        Box(Modifier.matchParentSize()) {
                            CircularProgressIndicator(Modifier.align(Alignment.Center))
                        }
                    }
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(dog.name, fontWeight = FontWeight.Bold)
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text("Age: ${dog.age}", style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun DogRowPreview() {
    MyTheme {
        DogList(adoptableDogs, null)
    }
}