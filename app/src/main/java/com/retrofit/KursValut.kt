package com.retrofit

import com.google.gson.annotations.SerializedName

//Класс для получения даных из JSON ответа
data class KursValut (

@SerializedName("USD_RUB")
    val usdrub : Double,
@SerializedName("EUR_RUB")
    val eurrub : Double
)