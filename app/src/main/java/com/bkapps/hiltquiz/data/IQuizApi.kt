package com.bkapps.hiltquiz.data

import retrofit2.http.GET
import retrofit2.http.Query

interface IQuizApi {

    @GET("/api.php")
    suspend fun getRandomQuestions(
        @Query("amount") numberOfQuestions: Int = 10
    ): QuestionResponse

}