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
    var sexo = "M"

    when(sexo) {
        "M" -> println("Masculino")
        "F" -> println("Feminino")
        else -> println("Valores inseridos incorretamente")
    }

}