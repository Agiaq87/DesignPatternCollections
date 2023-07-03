package abstract_factory;

public class ConcreteLogTerminalProduct implements AbstractLogProduct{
    @Override
    public boolean log(String message) {
        System.out.println(message);
        return true;
    }
}
