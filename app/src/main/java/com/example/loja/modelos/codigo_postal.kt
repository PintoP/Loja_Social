package com.example.loja.modelos

class codigo_postal {
    var idcodigo_postal : Int =0
    var localidade :String = ""
    var codigo_area : Int =0
    var extensao :Int = 0


    var IdCodigoPostal: Int
        get() = idcodigo_postal
        set(value) { idcodigo_postal = value }

    var Localidade: String
        get() = localidade
        set(value) { localidade = value }

    var CodigoArea: Int
        get() = codigo_area
        set(value) { codigo_area = value }

    var Extensao: Int
        get() = extensao
        set(value) { extensao = value }

}