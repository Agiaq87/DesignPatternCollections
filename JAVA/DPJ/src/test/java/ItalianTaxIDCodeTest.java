import it.giaquinto.design.pattern.model.ItalianTaxIDCode;
import it.giaquinto.design.pattern.model.WrongValueInserted;
import org.junit.jupiter.api.Test;

public class ItalianTaxIDCodeTest {

    @Test
    public void checkCorrectTaxIdCodeWithIncorrectValue() {
        ItalianTaxIDCode result = null;
        try {
            result = new ItalianTaxIDCode("GTBMRCI28K06Z246I");
        } catch (final WrongValueInserted e) {
            assert (result == null);
        }
    }
}
