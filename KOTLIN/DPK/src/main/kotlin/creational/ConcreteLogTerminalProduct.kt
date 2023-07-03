package creational



class ConcreteLogTerminalProduct : AbstractLogProduct {
    override fun log(message: String): Boolean {
        println(message)
        return true
    }
}