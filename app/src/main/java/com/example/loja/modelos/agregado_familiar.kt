package com.example.loja.modelos

class agregado_familiar {
    //region atributos
    var id_agregadoFamiliar : Int = 0
    var descricao : String=""
    var nota : String = ""


    //region propriedades
    var Id_agregadoFamiliar: Int
        get() = id_agregadoFamiliar
        set(value) { id_agregadoFamiliar = value }

    var Descricao: String
        get() = descricao
        set(value) { descricao = value }

    var Nota:String
        get() = nota
        set(value) { nota = value }

    //region metodos
}