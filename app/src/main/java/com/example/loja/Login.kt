package com.example.loja

import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.loja.modelos.Administrador

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //iniciar a classe admins e voluntarois
        val admin = Administrador()

        // Você pode adicionar a lógica de login aqui, se necessário
        Toast.makeText(this, "Tela de Login", Toast.LENGTH_SHORT).show()

        //clica no "Entrar"
        val bt_entrar: Button = findViewById(R.id.loginButton)
        val Email: EditText = findViewById(R.id.editEmail)
        val Password: EditText = findViewById(R.id.editPassword)

        bt_entrar.setOnClickListener {
            // Captura os valores dos EditTexts
            val email = Email.text.toString()
            val password = Password.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Chama a função valida_email
                admin.valida_email(this, email, password) { sucesso ->
                    if (sucesso) {
                        // Login bem-sucedido: navegar para outra tela
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish() // Opcional: finaliza a Activity atual
                    } else {
                        // Login falhou: exibe mensagem de erro
                        Toast.makeText(this, "Falha no login. Verifique suas credenciais.", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                // Se algum campo estiver vazio
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
