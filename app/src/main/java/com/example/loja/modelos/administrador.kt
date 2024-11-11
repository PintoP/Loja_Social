package com.example.loja.modelos

class administrador {
    //region atributos
    var nome: String = ""
    var email: String = ""
    var contacto: Int =0
    var palavrapasse: String = ""


    //region propriedades
    // Getter e Setter para 'nome'
    var Nome: String
        get() = nome
        set(value) { nome = value }

        // Getter e Setter para 'email'
    var Mail: String
        get() = email
        set(value) { email = value }

        // Getter e Setter para 'contacto'
    var Contacto: Int
        get() = contacto
        set(value) { contacto = value }

        // Getter e Setter para 'palavraPasse'
    var palavraPasse: String
        get() = palavrapasse
        set(value) { palavrapasse = value }

    //region metodos

        //função pra editar

        //função pra remover admin

        //função pra validar o login
    fun valida_email(a_email: String, a_pass : String)
    {

    }
}