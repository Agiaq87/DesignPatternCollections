package abstract_factory;

public class ConcreteLogFactory implements AbstractLogFactory {
    @Override
    public AbstractLogProduct makeTerminal() {
        return new ConcreteLogTerminalProduct();
    }

    @Override
    public AbstractLogProduct makeFile() {
        return new ConcreteLogFileProduct();
    }
}
