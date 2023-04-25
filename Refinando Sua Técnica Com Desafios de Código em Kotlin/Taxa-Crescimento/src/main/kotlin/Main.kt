data class Pais(var populacao: Double, val taxaCrescimento: Double)

fun main() {
    val habitantesPaisA = readLine()!!.toDouble()
    val habitantesPaisB = readLine()!!.toDouble()

    // Verifica se a população do país A é menor que a população do país B
    if (habitantesPaisA >= habitantesPaisB) {
        println("O valor inicial da população A deve ser menor que a população do país B.")
        return
    }

    val paisA = Pais(habitantesPaisA, taxaCrescimento = 0.03)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 0.015)

    var quantidadeAnos = 0
    while (paisA.populacao < paisB.populacao) {
        paisA.populacao *= (1 + paisA.taxaCrescimento)
        paisB.populacao *= (1 + paisB.taxaCrescimento)
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}
