package com.example.petshop

class Sad(date: String): CurrentMood(date){
    override fun mood(): String{
        return "Sad"
    }
}
