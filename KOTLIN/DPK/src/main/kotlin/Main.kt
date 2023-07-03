import creational.AbstractLogFactory
import creational.ConcreteLogFactory

fun main(args: Array<String>) {
    val factory: AbstractLogFactory = ConcreteLogFactory()

    factory.makeFile().log("TEST FILE LOG")
    factory.makeTerminal().log("TEST TERMINAL LOG")
}