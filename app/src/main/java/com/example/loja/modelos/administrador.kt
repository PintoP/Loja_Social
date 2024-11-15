package com.example.loja.modelos

import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import android.content.Context

class Administrador {
    //region atributos
    var nome: String = ""
    var email: String = ""
    var contacto: Int = 0
    var palavrapasse: String = ""
    //endregion

    //region metodos

    // Função para validar o login do administrador
    fun valida_email(context: Context, a_email: String, a_pass: String, callback: (Boolean) -> Unit) {
        val db = FirebaseFirestore.getInstance()

        // Referência para a coleção de administradores no Firestore
        val query = db.collection("administradores")
            .whereEqualTo("email", a_email)
            .whereEqualTo("palavrapasse", a_pass)

        query.get()
            .addOnSuccessListener { documents ->
                if (documents.isEmpty) {
                    // Caso o email e senha não correspondam
                    Toast.makeText(context,"Credenciais inválidas",Toast.LENGTH_SHORT).show()
                    callback(false)
                } else {
                    // Caso o login seja bem-sucedido
                    Toast.makeText(context,"Login realizado com sucesso",Toast.LENGTH_SHORT).show()
                    callback(true)
                }
            }
            .addOnFailureListener { exception ->
                // Caso haja algum erro no Firestore
                Toast.makeText(context,"Erro ao validar: ${exception.message}",Toast.LENGTH_SHORT).show()
                callback(false)
            }
    }

    //endregion
}
