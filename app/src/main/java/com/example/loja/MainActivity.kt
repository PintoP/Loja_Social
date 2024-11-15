package com.example.loja

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência aos botões
        val loginButton: Button = findViewById(R.id.loginButton)
        val registerButton: Button = findViewById(R.id.registerButton)

        // Ação para o botão de login
        loginButton.setOnClickListener {
            // Abre a LoginActivity quando o botão de login for clicado
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Ação para o botão de registrar
        registerButton.setOnClickListener {
            Toast.makeText(this, "Registrar clicado", Toast.LENGTH_SHORT).show()
        }
    }
}
