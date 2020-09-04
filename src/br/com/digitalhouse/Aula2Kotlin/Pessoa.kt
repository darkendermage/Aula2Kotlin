package br.com.digitalhouse.Aula2Kotlin

class Pessoa (var nome: String, var sobrenome: String) {
    //Propriedades
//    var nome: String = "Douglas"
//    val sobrenome: String = "Silva"
//    var idade: Int = 500

//    init {
//        print("Nome é : $nome $sobrenome")
//    }
//    var sexo: String = "M"
//
//    init {
//        print(" e o sexo é: $sexo .")
//    }

    fun andar() {
        print("A pessoa $nome $sobrenome está andando.")
    }

    fun criarRG(nome: String,numero: Int) : String {
        return nome + numero
    }

    fun passearComDog(cachorro: Cachorro) {
        println("Estou passeando com meu cachorro")
    }
}