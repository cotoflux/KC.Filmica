package com.example.android.filmica

data class Film(
    val id: String =  "",
    val titulo: String = "No title",
    val genere: String = "No genre",
    val rating: Float = 0.0f,
    val overview: String = "No overview",
    val date: String = "1999-09-19"
)