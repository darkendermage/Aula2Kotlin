package br.com.digitalhouse.Aula2Kotlin

fun main() {

    val brasileiro = Pessoa("João","Victor")
    val cachorro = Cachorro("Rodrigo",2,"Pug")
    brasileiro.andar()
    println(brasileiro.criarRG(brasileiro.nome,40028922))
    brasileiro.passearComDog(cachorro)



//    println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos.")
//
//    brasileiro.nome = "Sérgio"
//    println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade} anos.")
//
//    brasileiro.nome = "Geraldo"
//    println("O brasileiro é ${brasileiro.nome} ${brasileiro.sobrenome} e tem a idade de ${brasileiro.idade} anos.")

    //Retorna erro se tentar modificar um atributo val
    //brasileiro.sobrenome = "De jesus"
    //println("O brasileiro é ${brasileiro.nome} ${brasileiro.sobrenome} e tem a idade de ${brasileiro.idade} anos.")
//
//    val cachorro = Cachorro(racaP = "Pug",idadeP = 9)
//    println("O nome do cachorro é ${cachorro.nome}.")
//    println("A raça do cachorro é ${cachorro.raca} e tem ${cachorro.idade} anos.")
}