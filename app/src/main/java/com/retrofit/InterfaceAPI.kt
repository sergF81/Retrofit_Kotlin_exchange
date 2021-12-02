package com.retrofit

import retrofit2.Call
import retrofit2.http.GET

//Создаем интерфейс для Ретрофита
interface InterfaceAPI {

    @GET("convert?q=USD_RUB&compact=ultra&apiKey=251cfe6d05e69f7f3a6e")
    fun  getKursUSD(): Call<KursValut>

    @GET("convert?q=EUR_RUB&compact=ultra&apiKey=251cfe6d05e69f7f3a6e")
    fun  getKursEUR(): Call<KursValut>




}