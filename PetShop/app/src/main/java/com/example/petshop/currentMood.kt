package com.example.petshop

abstract class CurrentMood(val date: String) {
    abstract fun mood(): String
}
interface Mood {
    fun mood()
}