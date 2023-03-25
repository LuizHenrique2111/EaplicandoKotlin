fun main() {

    // As estruturas condicionais do kotlin são semelhantes as das outras linguagens de
    // programação

    var age = 15

    // O if e if else funiona como uma bifurcação, onde você vai seguir de acordo com a condição
    // criada dentro dos parenteses do if
   if (age > 18) {
        println("Você já pode beber bebida alcoolica.\nSua idade: $age")
    } else {
        println("Você ainda não tem idade para beber bebida alcoolica. \nSua idade: $age")
    }

    // Uma estrutura condicional do kotlin é o when, ele funciona de maneira semelhante ao switch em
    // outras linguagens e pode substituir o if else, em diversos pontos
    when {
        age > 18 -> {
            println("Você já pode beber bebida alcoolica.\nSua idade: $age")
        }
        else -> {
            println("Você ainda não tem idade para beber bebida alcoolica. \nSua idade: $age")
        }
    }

    // Tem também o for, que é utilizado em conjunto com arrays, que é algo que ainda não foi passado, mas
    // usaremos de maneira breve para exemplo
    val lista = listOf("a", "b", "c", "d")
    for (item in lista) {
        println(item)
    }

    // Esse código vai fazer com que a "variavel" item, pegasse um por um cada dado inserido na variavel
    // lista
}