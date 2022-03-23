package com.example.dictionaryappwithcatching.presentation

import com.example.dictionaryappwithcatching.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
