package com.example.cesaraugusto.palindromo.domain

class PalindromoK constructor(conteudo: String) {
    val conteudo: String = conteudo
        get() {
            return field.toLowerCase()
        }

    fun ehPalindromo(): Boolean {
        return conteudo == conteudo.reversed()
    }
}