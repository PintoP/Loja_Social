package com.example.loja.modelos

class estado {

    //Region atributos
    var idestado : Int = 0
    var estado : String =""
    var descricao : String =""

    //Region propriedades
    var Idestado: Int
        get() = idestado
        set(value) { idestado = value }

    var Estado: String
        get() = estado
        set(value) { estado = value }

    var Descricao: String
        get() = descricao
        set(value) { descricao = value }

    //Region metodos
}