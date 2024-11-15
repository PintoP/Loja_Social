package com.example.loja.modelos

class doacao {
    var idoacao : Int=0
    var data : String = ""
    var valor : String = ""
    var id_tipo : Int = 0
    var id_admin : Int =0

    var Idoacao: Int
        get() = idoacao
        set(value) { idoacao = value }

    var Data: String
        get() = data
        set(value) { data = value }

    var Valor: String
        get() = valor
        set(value) { valor = value }

    var Id_tipo: Int
        get() = id_tipo
        set(value) { id_tipo = value }

    var Id_admin: Int
        get() = id_admin
        set(value) { id_admin = value }
}