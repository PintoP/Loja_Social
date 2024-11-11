package com.example.loja.modelos

class nota {
    //region atributos
    var notaId : Int = 0
    var tipo : String = ""
    var descricao :String= ""
    var beneficiario_contacto : Int = 0
    var agregado_familiar_id : Int = 0


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

    // Getter e Setter para 'beneficiario_contacto'
    var BeneficiarioContacto: Int
        get() = beneficiario_contacto
        set(value) { beneficiario_contacto = value }

    // Getter e Setter para 'agregado_familiar_id'
    var AgregadoFamiliarId: Int
        get() = agregado_familiar_id
        set(value) { agregado_familiar_id = value }
}

//region metodos
