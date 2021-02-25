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
package com.example.androiddevchallenge.model

import androidx.compose.runtime.Immutable

@Immutable
data class Dog(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: String,
    val size: String,
    val description: String,
    val image: String
)

val adoptableDogs = listOf(
    Dog(
        id = 1,
        "Thor",
        2,
        "Male",
        "Large",
        "Requirements: Thor would do best in a home w/ adults & older children. No young children in the home please.\n\nRequirements: Thor suffers from severe skin allergies and takes Rx allergy medication. This will likely be a life long condition and will need to be monitored by your vet.\n\nHe should be the only dog in the home.\n\nDue to his on-leash reactivity, Thor would do best in a home outside of a city away from dog congestion and with a fenced yard. No apartments, condos, row homes. A single family home is needed.\n **Thor comes with FREE TRAINING! Included in your adoption fee, you will have access to Module One: Understanding your Reactive Dog. This is the first step to addressing your dog's on-leash behavior - understanding why they do what they do!**\n\nSex: Male\n\nAge: Young Adult- 2½ years old\n\nEnergy Level: Medium\n\nStrength Level: High\n\nWalks Best With: Freedom Harness\n\nIntake Reason: Transferred in from another facility.\n\nMore About Me: Hi, I'm Thor! I'm a very good and super playful boy. I am a vocal player (which means I growl when I play) and love the games tug, and fetch. Once I've gotten all my zoomies out, I'd really like to snuggle up on the couch together. I make the cutest little piggie grunts and I snore a little bit too -- sorry! I am a big boy and don't know my own strength, so I might knock down younger kids. Sometimes when I see other dogs outside, I get SO excited that I might bark and pull very hard, but I'm working on that with my training! My friends in the Behavior department are so nice that they want to keep helping me be the best dog I can be even after I leave here and find my forever home. I've been treated for some skin allergies while at the shelter and my handsome self is finally coming through! I will have to take a medication called Apoquel long term to help prevent me from getting itchy, but I take my pill like a champ.\n Are you looking for a side kick that'll turn heads and also make you laugh. Do you need a 60 pound lap dog? Then pick me, Thor! My adoption fee has been waived thanks to a generous donor!",
        "https://cdn.adopets.com/organization/pet/picture/2021028_151151_1611846711905.jpeg"
    ),
    Dog(
        id = 2,
        "Mena",
        8,
        "Female",
        "Large",
        "Requirements: Needs quiet home with a backyard (does not like walking on leash).\n\n Has arthritis and needs daily medications to help. Has trouble with stairs.\n\n Sex: Female\n\n Age: Senior- 8 years old\n\n More About Me: Mena is not the dog for just anyone, but for the right person she will be perfect. Are you looking for a companion for the couch not wanderer for a walk? Perfect. Can you work toward unwavering love and loyalty slowly and not expect it immediately? Perfect. Will you be able to limit treats to pleading eyes for the greater goal of good health? Perfect. Do you have a fenced backyard? Perfect. Do you have the type of home that can deal with some shedding but never have to worry about accidents? Perfect. Are you ready for a new best friend who will greet you with a wagging tail each morning and snuggle beside you as you wind down each day? Perfect! We have the dog for you!\n\n Notes from Foster Parent: Mena has been a great dog! We have been very happy to have her. She does shed a bit and it seemed like she shed a lot more when she first came, likely due to anxiety. But it settled down once she learned that we loved her.\n\n Be a little careful with hand feeding, she gets excited for food and isn't too careful about taking it out of our hands. It is probably better to place food on the floor and let her get it from there.\n\n Mena is an amazingly loving dog once she gets to know you. We have had her for 2 1/2 months now and she has learned to trust and love us. When we come into the house or come downstairs from the 2nd floor and she hears us her tail starts wagging a lot. She loves effusive love. She loves to get her butt scratched and tummy rubbed. She is great at her meal times and is very happy to watch us get her food ready and will bound over to where she eats when we go to put it down.\n\n She knows her name and will respond to Mena and \"puppy\". She will turn her head or will come over to us. She likes seeing animals in the backyard and will bound/run over to say hi to them.\n\n She does love to lay on the couch. She really loves our teens and is excited to see them.",
        "https://cdn.adopets.com/public/gallery_data/src/2021115_155852_1613404732086.png?width=400"
    ),
    Dog(
        id = 3,
        "Storm",
        1,
        "Female",
        "Medium",
        "Although Storm is a big gal, she's more like a sweet spring rain than a hurricane. At 81 lbs. this year-old pooch is a bit like the cowardly lion, she needs courage. She's working on it. She's been a receptive student during training exercises; continuing in a training class will undoubtedly help Storm build confidence. She would do best in a home without cats, other small animals or children.",
        "https://cdn.adopets.com/organization/pet/picture/202111_155150_1612194710014.jpeg?width=600"
    ),
    Dog(
        id = 4,
        "Sawyer",
        4,
        "Male",
        "Large",
        "Requirements: Thor would do best in a home w/ adults & older children. No young children in the home please.\n\nRequirements: Thor suffers from severe skin allergies and takes Rx allergy medication. This will likely be a life long condition and will need to be monitored by your vet.\n\nHe should be the only dog in the home.\n\nDue to his on-leash reactivity, Thor would do best in a home outside of a city away from dog congestion and with a fenced yard. No apartments, condos, row homes. A single family home is needed.\n **Thor comes with FREE TRAINING! Included in your adoption fee, you will have access to Module One: Understanding your Reactive Dog. This is the first step to addressing your dog's on-leash behavior - understanding why they do what they do!**\n\nSex: Male\n\nAge: Young Adult- 2½ years old\n\nEnergy Level: Medium\n\nStrength Level: High\n\nWalks Best With: Freedom Harness\n\nIntake Reason: Transferred in from another facility.\n\nMore About Me: Hi, I'm Thor! I'm a very good and super playful boy. I am a vocal player (which means I growl when I play) and love the games tug, and fetch. Once I've gotten all my zoomies out, I'd really like to snuggle up on the couch together. I make the cutest little piggie grunts and I snore a little bit too -- sorry! I am a big boy and don't know my own strength, so I might knock down younger kids. Sometimes when I see other dogs outside, I get SO excited that I might bark and pull very hard, but I'm working on that with my training! My friends in the Behavior department are so nice that they want to keep helping me be the best dog I can be even after I leave here and find my forever home. I've been treated for some skin allergies while at the shelter and my handsome self is finally coming through! I will have to take a medication called Apoquel long term to help prevent me from getting itchy, but I take my pill like a champ.\n Are you looking for a side kick that'll turn heads and also make you laugh. Do you need a 60 pound lap dog? Then pick me, Thor! My adoption fee has been waived thanks to a generous donor!",
        "https://cdn.adopets.com/organization/pet/picture/2021028_151151_1611846711905.jpeg"
    ),
    Dog(
        id = 5,
        "Huck",
        10,
        "Female",
        "Large",
        "Requirements: Needs quiet home with a backyard (does not like walking on leash).\n\n Has arthritis and needs daily medications to help. Has trouble with stairs.\n\n Sex: Female\n\n Age: Senior- 8 years old\n\n More About Me: Mena is not the dog for just anyone, but for the right person she will be perfect. Are you looking for a companion for the couch not wanderer for a walk? Perfect. Can you work toward unwavering love and loyalty slowly and not expect it immediately? Perfect. Will you be able to limit treats to pleading eyes for the greater goal of good health? Perfect. Do you have a fenced backyard? Perfect. Do you have the type of home that can deal with some shedding but never have to worry about accidents? Perfect. Are you ready for a new best friend who will greet you with a wagging tail each morning and snuggle beside you as you wind down each day? Perfect! We have the dog for you!\n\n Notes from Foster Parent: Mena has been a great dog! We have been very happy to have her. She does shed a bit and it seemed like she shed a lot more when she first came, likely due to anxiety. But it settled down once she learned that we loved her.\n\n Be a little careful with hand feeding, she gets excited for food and isn't too careful about taking it out of our hands. It is probably better to place food on the floor and let her get it from there.\n\n Mena is an amazingly loving dog once she gets to know you. We have had her for 2 1/2 months now and she has learned to trust and love us. When we come into the house or come downstairs from the 2nd floor and she hears us her tail starts wagging a lot. She loves effusive love. She loves to get her butt scratched and tummy rubbed. She is great at her meal times and is very happy to watch us get her food ready and will bound over to where she eats when we go to put it down.\n\n She knows her name and will respond to Mena and \"puppy\". She will turn her head or will come over to us. She likes seeing animals in the backyard and will bound/run over to say hi to them.\n\n She does love to lay on the couch. She really loves our teens and is excited to see them.",
        "https://cdn.adopets.com/public/gallery_data/src/2021115_155852_1613404732086.png?width=400"
    ),
    Dog(
        id = 6,
        "Duke",
        8,
        "Female",
        "Medium",
        "Although Storm is a big gal, she's more like a sweet spring rain than a hurricane. At 81 lbs. this year-old pooch is a bit like the cowardly lion, she needs courage. She's working on it. She's been a receptive student during training exercises; continuing in a training class will undoubtedly help Storm build confidence. She would do best in a home without cats, other small animals or children.",
        "https://cdn.adopets.com/organization/pet/picture/202111_155150_1612194710014.jpeg?width=600"
    ),
    Dog(
        id = 7,
        "Polaris",
        15,
        "Male",
        "Large",
        "Requirements: Thor would do best in a home w/ adults & older children. No young children in the home please.\n\nRequirements: Thor suffers from severe skin allergies and takes Rx allergy medication. This will likely be a life long condition and will need to be monitored by your vet.\n\nHe should be the only dog in the home.\n\nDue to his on-leash reactivity, Thor would do best in a home outside of a city away from dog congestion and with a fenced yard. No apartments, condos, row homes. A single family home is needed.\n **Thor comes with FREE TRAINING! Included in your adoption fee, you will have access to Module One: Understanding your Reactive Dog. This is the first step to addressing your dog's on-leash behavior - understanding why they do what they do!**\n\nSex: Male\n\nAge: Young Adult- 2½ years old\n\nEnergy Level: Medium\n\nStrength Level: High\n\nWalks Best With: Freedom Harness\n\nIntake Reason: Transferred in from another facility.\n\nMore About Me: Hi, I'm Thor! I'm a very good and super playful boy. I am a vocal player (which means I growl when I play) and love the games tug, and fetch. Once I've gotten all my zoomies out, I'd really like to snuggle up on the couch together. I make the cutest little piggie grunts and I snore a little bit too -- sorry! I am a big boy and don't know my own strength, so I might knock down younger kids. Sometimes when I see other dogs outside, I get SO excited that I might bark and pull very hard, but I'm working on that with my training! My friends in the Behavior department are so nice that they want to keep helping me be the best dog I can be even after I leave here and find my forever home. I've been treated for some skin allergies while at the shelter and my handsome self is finally coming through! I will have to take a medication called Apoquel long term to help prevent me from getting itchy, but I take my pill like a champ.\n Are you looking for a side kick that'll turn heads and also make you laugh. Do you need a 60 pound lap dog? Then pick me, Thor! My adoption fee has been waived thanks to a generous donor!",
        "https://cdn.adopets.com/organization/pet/picture/2021028_151151_1611846711905.jpeg"
    ),
    Dog(
        id = 8,
        "Addie",
        9,
        "Female",
        "Large",
        "Requirements: Needs quiet home with a backyard (does not like walking on leash).\n\n Has arthritis and needs daily medications to help. Has trouble with stairs.\n\n Sex: Female\n\n Age: Senior- 8 years old\n\n More About Me: Mena is not the dog for just anyone, but for the right person she will be perfect. Are you looking for a companion for the couch not wanderer for a walk? Perfect. Can you work toward unwavering love and loyalty slowly and not expect it immediately? Perfect. Will you be able to limit treats to pleading eyes for the greater goal of good health? Perfect. Do you have a fenced backyard? Perfect. Do you have the type of home that can deal with some shedding but never have to worry about accidents? Perfect. Are you ready for a new best friend who will greet you with a wagging tail each morning and snuggle beside you as you wind down each day? Perfect! We have the dog for you!\n\n Notes from Foster Parent: Mena has been a great dog! We have been very happy to have her. She does shed a bit and it seemed like she shed a lot more when she first came, likely due to anxiety. But it settled down once she learned that we loved her.\n\n Be a little careful with hand feeding, she gets excited for food and isn't too careful about taking it out of our hands. It is probably better to place food on the floor and let her get it from there.\n\n Mena is an amazingly loving dog once she gets to know you. We have had her for 2 1/2 months now and she has learned to trust and love us. When we come into the house or come downstairs from the 2nd floor and she hears us her tail starts wagging a lot. She loves effusive love. She loves to get her butt scratched and tummy rubbed. She is great at her meal times and is very happy to watch us get her food ready and will bound over to where she eats when we go to put it down.\n\n She knows her name and will respond to Mena and \"puppy\". She will turn her head or will come over to us. She likes seeing animals in the backyard and will bound/run over to say hi to them.\n\n She does love to lay on the couch. She really loves our teens and is excited to see them.",
        "https://cdn.adopets.com/public/gallery_data/src/2021115_155852_1613404732086.png?width=400"
    ),
    Dog(
        id = 9,
        "Isabelle",
        8,
        "Female",
        "Medium",
        "Although Storm is a big gal, she's more like a sweet spring rain than a hurricane. At 81 lbs. this year-old pooch is a bit like the cowardly lion, she needs courage. She's working on it. She's been a receptive student during training exercises; continuing in a training class will undoubtedly help Storm build confidence. She would do best in a home without cats, other small animals or children.",
        "https://cdn.adopets.com/organization/pet/picture/202111_155150_1612194710014.jpeg?width=600"
    ),
    Dog(
        id = 10,
        "Ginger",
        5,
        "Male",
        "Large",
        "Requirements: Thor would do best in a home w/ adults & older children. No young children in the home please.\n\nRequirements: Thor suffers from severe skin allergies and takes Rx allergy medication. This will likely be a life long condition and will need to be monitored by your vet.\n\nHe should be the only dog in the home.\n\nDue to his on-leash reactivity, Thor would do best in a home outside of a city away from dog congestion and with a fenced yard. No apartments, condos, row homes. A single family home is needed.\n **Thor comes with FREE TRAINING! Included in your adoption fee, you will have access to Module One: Understanding your Reactive Dog. This is the first step to addressing your dog's on-leash behavior - understanding why they do what they do!**\n\nSex: Male\n\nAge: Young Adult- 2½ years old\n\nEnergy Level: Medium\n\nStrength Level: High\n\nWalks Best With: Freedom Harness\n\nIntake Reason: Transferred in from another facility.\n\nMore About Me: Hi, I'm Thor! I'm a very good and super playful boy. I am a vocal player (which means I growl when I play) and love the games tug, and fetch. Once I've gotten all my zoomies out, I'd really like to snuggle up on the couch together. I make the cutest little piggie grunts and I snore a little bit too -- sorry! I am a big boy and don't know my own strength, so I might knock down younger kids. Sometimes when I see other dogs outside, I get SO excited that I might bark and pull very hard, but I'm working on that with my training! My friends in the Behavior department are so nice that they want to keep helping me be the best dog I can be even after I leave here and find my forever home. I've been treated for some skin allergies while at the shelter and my handsome self is finally coming through! I will have to take a medication called Apoquel long term to help prevent me from getting itchy, but I take my pill like a champ.\n Are you looking for a side kick that'll turn heads and also make you laugh. Do you need a 60 pound lap dog? Then pick me, Thor! My adoption fee has been waived thanks to a generous donor!",
        "https://cdn.adopets.com/organization/pet/picture/2021028_151151_1611846711905.jpeg"
    ),
    Dog(
        id = 11,
        "Cody",
        6,
        "Female",
        "Large",
        "Requirements: Needs quiet home with a backyard (does not like walking on leash).\n\n Has arthritis and needs daily medications to help. Has trouble with stairs.\n\n Sex: Female\n\n Age: Senior- 8 years old\n\n More About Me: Mena is not the dog for just anyone, but for the right person she will be perfect. Are you looking for a companion for the couch not wanderer for a walk? Perfect. Can you work toward unwavering love and loyalty slowly and not expect it immediately? Perfect. Will you be able to limit treats to pleading eyes for the greater goal of good health? Perfect. Do you have a fenced backyard? Perfect. Do you have the type of home that can deal with some shedding but never have to worry about accidents? Perfect. Are you ready for a new best friend who will greet you with a wagging tail each morning and snuggle beside you as you wind down each day? Perfect! We have the dog for you!\n\n Notes from Foster Parent: Mena has been a great dog! We have been very happy to have her. She does shed a bit and it seemed like she shed a lot more when she first came, likely due to anxiety. But it settled down once she learned that we loved her.\n\n Be a little careful with hand feeding, she gets excited for food and isn't too careful about taking it out of our hands. It is probably better to place food on the floor and let her get it from there.\n\n Mena is an amazingly loving dog once she gets to know you. We have had her for 2 1/2 months now and she has learned to trust and love us. When we come into the house or come downstairs from the 2nd floor and she hears us her tail starts wagging a lot. She loves effusive love. She loves to get her butt scratched and tummy rubbed. She is great at her meal times and is very happy to watch us get her food ready and will bound over to where she eats when we go to put it down.\n\n She knows her name and will respond to Mena and \"puppy\". She will turn her head or will come over to us. She likes seeing animals in the backyard and will bound/run over to say hi to them.\n\n She does love to lay on the couch. She really loves our teens and is excited to see them.",
        "https://cdn.adopets.com/public/gallery_data/src/2021115_155852_1613404732086.png?width=400"
    ),
    Dog(
        id = 12,
        "Blaze",
        2,
        "Male",
        "Medium",
        "Although Storm is a big gal, she's more like a sweet spring rain than a hurricane. At 81 lbs. this year-old pooch is a bit like the cowardly lion, she needs courage. She's working on it. She's been a receptive student during training exercises; continuing in a training class will undoubtedly help Storm build confidence. She would do best in a home without cats, other small animals or children.",
        "https://cdn.adopets.com/organization/pet/picture/202111_155150_1612194710014.jpeg?width=600"
    )
)
