fun main() {
    val numeralRomano = readLine()!!
    val mapaValores = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var resultado = 0
    var ultimoValor = 0

    for (c in numeralRomano.reversed()) {
        val valor = mapaValores[c] ?: error("Caractere inválido: $c")
        if (valor < ultimoValor) {
            resultado -= valor
        } else {
            resultado += valor
        }
        ultimoValor = valor
    }

    println(resultado)
}
