package com.example.loja

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Você pode adicionar a lógica de login aqui, se necessário
        Toast.makeText(this, "Tela de Login", Toast.LENGTH_SHORT).show()
    }
}
