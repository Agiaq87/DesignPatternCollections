import it.giaquinto.design.pattern.abstractFactory.support.LoggerBuffer;
import it.giaquinto.design.pattern.model.Pair;
import it.giaquinto.design.pattern.model.Priority;
import org.junit.jupiter.api.Test;

public class LoggerBufferTest {

    class LoggerBufferImpl extends LoggerBuffer {

    }

    @Test
    public void checkInsertionOnBuffer_AssertTrueWithOneInsertion() {
        final var loggerBuffer = new LoggerBufferImpl();

        loggerBuffer.insertNew(new Pair<>("ESEMPIO", Priority.EMERGENCY));

        assert(loggerBuffer.getLast().equals(new Pair<>("ESEMPIO", Priority.EMERGENCY)));
    }

    @Test
    public void checkInsertionOnBuffer_AssertTrueWithAllEqualsSizeOne() {
        final var loggerBuffer = new LoggerBufferImpl();

        loggerBuffer.insertNew(new Pair<>("ESEMPIO", Priority.EMERGENCY));

        assert(loggerBuffer.getAll().size() == 1);
    }
}
