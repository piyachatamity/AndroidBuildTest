package com.piyachat.jenkins.example.androidtestbuild01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.piyachat.jenkins.example.hellolibrary.CreateHelloMessage
import com.piyachat.jenkins.example.hellomodule.HelloCore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hello = HelloCore()

        val textView = findViewById<TextView>(R.id.txt)
//        textView.text = "Test Build Android: " + hello.getMessage()

        val helloMessage = CreateHelloMessage("John Cena").getMessage()

        var message = "Test Build Android: " + hello.getMessage() + "\n" + helloMessage
        textView.text = message
    }
}