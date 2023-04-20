class Pessoa(var nome: String, var idade: Int) {

    fun andar() {
        println("$nome está andando")
    }

    fun falar(mensagem: String) {
        println("$nome está falando: $mensagem")
    }
}
