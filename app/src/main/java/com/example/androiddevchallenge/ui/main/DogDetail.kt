/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.main

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.contentColorFor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
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
