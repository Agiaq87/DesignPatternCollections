import it.giaquinto.design.pattern.model.Height;
import org.junit.jupiter.api.Test;

public class HeightTest {

    @Test
    public void checkCorrectConversionFromKgsToLbs() {
        var result = new Height(170);

        assert (((int)result.getInch()) == 66);
    }

    @Test
    public void checkCorrectConversionFromLbsToKgs() {
        var result = new Height(66.92913385826772);

        assert (result.getCm() == 170);
    }
}
