package com.example.loja.modelos

class nota {
    //region atributos
    var notaId : Int = 0
    var tipo : String = ""
    var descricao :String= ""


    // Getter e Setter para 'notaId'
    var NotaId: Int
        get() = notaId
        set(value) { notaId = value }

    // Getter e Setter para 'tipo'
    var Tipo: String
        get() = tipo
        set(value) { tipo = value }

    // Getter e Setter para 'descricao'
    var Descricao: String
        get() = descricao
        set(value) { descricao = value }
}

//region metodos
