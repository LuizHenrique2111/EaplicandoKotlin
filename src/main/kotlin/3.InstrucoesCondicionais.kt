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

    // Você também pode trabalhar com duas ou mais variaveis dentro das estruturas condicionais, por
    // exemplo:
    val name = "Jorge"
    val yearsInvesting = 10

    if (name == "Jorge" && yearsInvesting > 8) {
        println("Jorge é um investidor de longo prazo")
    } else if (name == "Jorge" && (yearsInvesting > 3 && yearsInvesting <= 8)) {
        println("Jorge é um investidor de médio prazo")
    } else if (name == "Jorge" && yearsInvesting <= 3) {
        println("Jorge é um investidor de curto prazo")
    } else {
        println("Jorge não é um investidor")
    }

    // Quando eu utilizo o &&, ele repesenta a letra E(AND), quer dizer que ambas as afirmações(que o nome
    // do rapaz é jorge e o número de anos investidos), tenham que ser corretos, para que o código específico
    // seja verificado, além do &&, tem outros simbolos que podem ser usados que significam coisas diferentes
    // estudar sobre tabela verdade para esclarecer sobre o assunto

}