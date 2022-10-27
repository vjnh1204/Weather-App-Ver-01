package com.example.weatherapp.models

data class Sys(
    val country: String,
    val id: Long,
    val sunrise: Long,
    val sunset: Long,
    val type: Int
):java.io.Serializable