package com.bkapps.hiltquiz.data

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class QuestionResponse(
    @SerializedName("response_code")
    val responseCode: Int? = null,
    @SerializedName("results")
    val questions: List<Question>? = emptyList()
): Serializable
