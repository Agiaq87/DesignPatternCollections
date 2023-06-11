import it.giaquinto.design.pattern.abstractFactory.concrete.ConcreteFactoryLog;
import it.giaquinto.design.pattern.model.Priority;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    /*
    Arrange
    Act
6    Assert
     */
    @Test
    public void makeNewFileLoggerAndWriteEmergency() {
        final var factoryLog = new ConcreteFactoryLog();

        assert(factoryLog.createFileLog().writeLog("ESEMPIO", Priority.EMERGENCY));
    }

    @Test
    public void makeNewTerminalLoggerAndWriteEmergency() {
        final var factoryLog = new ConcreteFactoryLog();
        final var terminalLogger = factoryLog.createTextualLog();
        assert(terminalLogger.writeLog("ESEMPIO", Priority.EMERGENCY));
    }
}
