package com.piyachat.jenkins.example.hellolibrary

class CreateHelloMessage(private val name: String) {

    fun getMessage(): String {
        return "Hello $name !!"
    }
}