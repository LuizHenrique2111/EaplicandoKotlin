fun main() {

    // Para você inserir ver os dados pelo console, da maneira que quer, você irá utlizar
    // algumas possibilidades

    // 1. " "
    val message = "Ola Tiago,\nSeu produto chegou!"
    println(message)

    // 2. """ """"
    val welcome = """
        Olá Tiago,
        Seu produto chegou!
    """.trimIndent()
    println(welcome)

    // 3. .replaceIndent("alguma coisa"), faz com que antes de cada linha entre os """ seja
    // substituida pelo que estiver escrito no parenteses do replaceIndent
    val welcome1 = """
        Olá Tiago,
        Seu produto chegou!
    """.replaceIndent("->")
    println(welcome1)

    // 4.
    val name = "Tiago"
    val age = 31
    val price = 19.90
    println("Olá, " + name + ". Sua idade é " + age + ". Seu desconto é: " + price)
    // ou
    println("Olá, $name. Sua idade é $age. Seu desconto é: $price")

}