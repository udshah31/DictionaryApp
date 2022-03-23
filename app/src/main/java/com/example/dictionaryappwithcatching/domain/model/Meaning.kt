package com.example.dictionaryappwithcatching.domain.model

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
