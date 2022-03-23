package com.example.dictionaryappwithcatching.domain.repository

import com.example.core.util.Resource
import com.example.dictionaryappwithcatching.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow


interface WordInfoRepository {

    fun getWordInfo(word:String): Flow<Resource<List<WordInfo>>>
}