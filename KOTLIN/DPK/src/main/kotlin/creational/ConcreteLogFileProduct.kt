package creational

import java.io.FileWriter
import java.io.IOException

class ConcreteLogFileProduct : AbstractLogProduct {
    override fun log(message: String): Boolean {
        try {
            val f = FileWriter("log.txt")
            f.write(message)
        } catch (e: IOException) {
            return false
        }

        return true
    }

}
