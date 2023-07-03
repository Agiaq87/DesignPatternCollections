package abstract_factory;

public interface AbstractLogFactory {
    AbstractLogProduct makeTerminal();
    AbstractLogProduct makeFile();
}
