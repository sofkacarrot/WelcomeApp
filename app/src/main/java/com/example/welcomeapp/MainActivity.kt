package com.example.welcomeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим элементы по их id
        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        val inputField = findViewById<EditText>(R.id.inputField)
        val sendButton = findViewById<Button>(R.id.sendButton)

        // Устанавливаем обработчик на кнопку
        sendButton.setOnClickListener {
            // Получаем текст из поля для ввода
            val enteredText = inputField.text.toString()

            // Отображаем текст в Toast-сообщении
            Toast.makeText(this, "Вы ввели: $enteredText", Toast.LENGTH_SHORT).show()
        }
    }
}
