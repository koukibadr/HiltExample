package com.bkapps.hiltquiz.data.repositories

import com.bkapps.hiltquiz.data.IQuizApi
import com.bkapps.hiltquiz.data.QuestionResponse
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: IQuizApi) {

    suspend fun getQuestions(): QuestionResponse{
        return api.getRandomQuestions()
    }

}