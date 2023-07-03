package creational

interface AbstractLogFactory {
    fun makeTerminal(): AbstractLogProduct
    fun makeFile(): AbstractLogProduct
}