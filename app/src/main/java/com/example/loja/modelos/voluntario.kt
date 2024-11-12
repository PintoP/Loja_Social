
package com.example.loja.modelos
import java.time.LocalDate
class voluntario {


    var idvoluntario :Int=0
    var nome : String =""
    var data_entrada : String = "" //mudar para LocalDate
    var email : String = ""
    var palavra_passe : String = ""
    var cargo :  String = ""
    var estado : String = ""


    //Region propriedades
    var Idvoluntario: Int
        get() = idvoluntario
        set(value) { idvoluntario = value }

    var Nome: String
        get() = nome
        set(value) { nome = value }

    var Data_entrada: String
        get() = data_entrada
        set(value) { data_entrada = value }

    var Email: String
        get() = email
        set(value) { email = value }

    var Palavra_passe: String
        get() = palavra_passe
        set(value) { palavra_passe = value }

    var Cargo: String
        get() = cargo
        set(value) { cargo = value }

    var Estado: String
        get() = estado
        set(value) { estado = value }

    //Region metodos
}