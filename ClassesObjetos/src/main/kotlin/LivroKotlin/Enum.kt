package LivroKotlin

import LivroKotlin.Interface.Printable

enum class Plants(val days: Int, val size: Float){
    MILHO(2, 1.22F),
    MANDIOCA(10, 2.22F),
    PIMENTA(30, 1.00F)

}
enum class Word : Printable {
    HELLO{
        override fun print() {
            println("Hello")
        }

    },
    HELP{
        override fun print() {
            println("Help")
        }
    }
}