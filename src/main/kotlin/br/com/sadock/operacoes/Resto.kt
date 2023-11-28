package br.com.sadock.operacoes

class Resto constructor(
    val numero1: Double,
    val numero2: Double) {

    fun restoDivisao() {
        println(numero1 % numero2)
    }
}