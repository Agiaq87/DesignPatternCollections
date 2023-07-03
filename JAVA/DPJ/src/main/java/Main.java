import abstract_factory.AbstractLogFactory;
import abstract_factory.ConcreteLogFactory;

public class Main {
    public static void main(String[] args) {
        final AbstractLogFactory factory = new ConcreteLogFactory();
        factory.makeTerminal().log("TEST TERMINAL LOG");
        factory.makeFile().log("TEST FILE LOG");
    }
}
