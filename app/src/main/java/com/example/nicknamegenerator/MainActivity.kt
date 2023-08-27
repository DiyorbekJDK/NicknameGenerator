package com.example.nicknamegenerator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nicknamegenerator.databinding.ActivityMainBinding
import java.io.IOException
import java.io.InputStream

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.textView.text = randomWord() + randomWord() + randomWord() +randomWord() + randomWord() + randomWord()
        }
        binding.button2.setOnClickListener {
            binding.textView.text = randomWord2() + randomWord2() + randomWord2() +randomWord2() + randomWord2() + randomWord2()
        }

    }

    private fun randomWord(): String {
        val myOutput: String
        val myInputStream: InputStream

//        try {
        myInputStream = assets.open("letters.txt")
        val size: Int = myInputStream.available()
        val buffer = ByteArray(size)
        myInputStream.read(buffer)
        myOutput = String(buffer)

        // Split the string into an array of words.
        val words = myOutput.split(" ")

        // Get a random word from the array.
        val randomWord = words.random()

        // Display the random word in the text view.
//            binding.textView.text =
//                randomWord
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
        return randomWord
    }

    private fun randomWord2(): String {
        val myOutput: String
        val myInputStream2: InputStream

//        try {
        myInputStream2 = assets.open("let_two")
        val size: Int = myInputStream2.available()
        val buffer = ByteArray(size)
        myInputStream2.read(buffer)
        myOutput = String(buffer)

        // Split the string into an array of words.
        val words = myOutput.split(" ")

        // Get a random word from the array.
        val randomWord2 = words.random()

        // Display the random word in the text view.
//            binding.textView.text =
//                randomWord
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
        return randomWord2
    }
}