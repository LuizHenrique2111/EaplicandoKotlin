fun main() {

    // Em Kotlin você pode declarar uma variável de diferente maneiras,
    // utilizando a palavra-chave val ou var, a palavra-chave "val" implica
    // em dizer que a variavel não pode ser alteradam já na palavra "var"
    // você pode alterar o valor posteriormente, utilizando apenas essas
    // palavras, vocês terão que inserir o dado inicial da variável, você
    // pode ou não optar por digitar o tipo que a variável possui, pois
    // quando você insere o valor ela já sabe dizer qual tipo você pretendia
    // informar, na variável numberC e numberD foi feito sem declarar o tipo
    // específico.

    val numberA: Int = 10
    var numberB: Int = 10
    val numberC = 10
    var numberD = 10

    // Alterando as informações nas variáveis com a palavra chave "var"
    numberB = 15
    numberD = 20

    // Variaveis strings

    val nome: String = "Marcos"

    // Caso você queira descobrir a classe da variavel, você pode utilizar
    // o comando nomeVariavel::class
    println(nome::class)

    // Com isso você poderá enxerga a classe a da variavel

}
