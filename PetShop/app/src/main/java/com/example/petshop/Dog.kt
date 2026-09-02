package com.example.petshop

class Dog(name: String, age: Int): Pet(name, age), Pettable, Mood {
    override fun speak(): String {
        return "bark"
    }
    override fun pet() {
        println("The dog $name is being petted")
    }
    override fun mood() {
        println("")
    }
}