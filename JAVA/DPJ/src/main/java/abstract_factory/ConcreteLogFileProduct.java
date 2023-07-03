package abstract_factory;

import java.io.FileWriter;
import java.io.IOException;

public class ConcreteLogFileProduct implements AbstractLogProduct{
    @Override
    public boolean log(String message) {
        try (var f = new FileWriter("log.txt")) {
            f.write(message);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
