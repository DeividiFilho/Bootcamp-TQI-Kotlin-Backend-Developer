// Estruturas condicionais:
val a = 10
val b = 20

    if (a > b) {
        println("a é maior que b")
    } else {
        println("b é maior que a")
    }

    when (a) {
        10 -> println("a é igual a 10")
        20 -> println("a é igual a 20")
        else -> println("a não é igual a 10 ou 20")
}

// Laços de repetição:

    val numbers = arrayOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println(number)
    }

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

// Salto (break/continue):
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

    for(i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }

// Coleções:
// List, Set, Map, LinkedList

// cria uma lista de números
    val numeros = listOf(1, 2, 3, 4, 5)

// filtra os números pares da lista
    val numerosPares = numeros.filter { it % 2 == 0 }

// imprime os números pares
    println(numerosPares) // output: [2, 4]



