package com.example.loja.modelos

class beneficiario {

    var idbenefeciario : Int =0
    var nome : String = ""
    var contacto : String =""
    var nacionalidade : String ="" //buscar á tabela de nacionalidade
    var codigo_postal : String = ""//buscar á tabela de cp
    var localidade : String ="" //buscar á tabela de cp
    var id_agregado_familiar : Int = 0

    //Region propriedades
    var Idbenefeciario: Int
        get() = idbenefeciario
        set(value) { idbenefeciario = value }

    var Nome: String
        get() = nome
        set(value) { nome = value }

    var Contacto: String
        get() = contacto
        set(value) { contacto = value }

    var Nacionalidade: String
        get() = nacionalidade
        set(value) { nacionalidade = value }

    var Codigo_postal: String
        get() = codigo_postal
        set(value) { codigo_postal = value }

    var Localidade: String
        get() = localidade
        set(value) { localidade = value }

    var Id_agregado_familiar: Int
        get() = id_agregado_familiar
        set(value) { id_agregado_familiar = value }

    //Region metodos
}