package creational

class ConcreteLogFactory : AbstractLogFactory {
    override fun makeTerminal(): AbstractLogProduct = ConcreteLogTerminalProduct()

    override fun makeFile(): AbstractLogProduct = ConcreteLogFileProduct()
}