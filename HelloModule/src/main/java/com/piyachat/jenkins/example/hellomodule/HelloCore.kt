package com.piyachat.jenkins.example.hellomodule

class HelloCore {
    private val text: String = "Hello from library"

    fun getMessage(): String {
        return text
    }
}