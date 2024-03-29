package br.com.slmm.retrofit1.rest

import br.com.slmm.retrofit1.model.QuestionList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")    //End Url
    fun fetchQuestions(@Query("tagged") tags: String): Call<QuestionList>

}