package br.com.sadock.main
import br.com.sadock.operacoes.*
import java.util.*

fun main() {
    val leitura = Scanner(System.`in`)
    println("Digite o primeiro número para o cálculo: ")
    val numero1 = leitura.nextDouble()
    println("Digite o segundo número para o cálculo: ")
    val numero2 = leitura.nextDouble()
    println("""Escolha uma das opções:
        |1 - Soma
        |2 - Subtração
        |3 - Divisão
        |4 - Multiplicação
        |5 - Potência
        |6 - Resto da Divisão
    """.trimMargin())
    val opcao = leitura.nextInt()

    when(opcao) {
        1 -> Soma(numero1, numero2).somar()
        2 -> Subtracao(numero1, numero2).subtrair()
        3 -> Divisao(numero1, numero2).divisao()
        4 -> Multiplicacao(numero1, numero2).multiplicar()
        5 -> Potencia(numero1, numero2).potenciacao()
        6 -> Resto(numero1, numero2).restoDivisao()
    }

}