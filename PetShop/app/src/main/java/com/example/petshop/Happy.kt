package com.example.petshop

class Happy(date: String): CurrentMood(date) {
    override fun mood(): String{
        return "Happy"
    }
}
