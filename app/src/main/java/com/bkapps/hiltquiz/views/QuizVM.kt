package com.bkapps.hiltquiz.views

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bkapps.hiltquiz.data.repositories.QuestionRepository
import kotlinx.coroutines.Dispatchers

class QuizVM @ViewModelInject constructor(
    private val questionRepository: QuestionRepository): ViewModel() {

    internal fun getQuestions() = liveData(Dispatchers.IO) {
        emit(questionRepository.getQuestions())
    }

}