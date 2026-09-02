package com.example.petshop

class Scorpion(name: String, age: Int): Pet(name, age), Mood {
    override fun speak(): String {
        return "hiss"
    }
    override fun mood() {
        println("")
    }
}