package com.bkapps.hiltquiz.views

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.bkapps.hiltquiz.data.repositories.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class QuizVM @Inject constructor(
    private val questionRepository: QuestionRepository): ViewModel() {

    internal fun getQuestions() = liveData(Dispatchers.IO) {
        emit(questionRepository.getQuestions())
    }

}