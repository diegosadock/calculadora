package br.com.sadock.operacoes

import kotlin.math.pow

class Potencia constructor(
    val numero1: Double,
    val numero2: Double) {

    fun potenciacao() {
        println(numero1.pow(numero2))
    }
}