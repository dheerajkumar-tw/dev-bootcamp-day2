import org.bootcamp.Centimeter;
import org.bootcamp.Meter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeterTest {

    @Test
    public void shouldReturnEqualWhen1cmAnd100meterAreCompared(){
        Double centimeterLength = 1.0;
        Double meterLength = 100.0;
        Centimeter centimeter = new Centimeter(centimeterLength);
        Meter meter = new Meter(meterLength);
        String result = "Equal";
        assertEquals(result, meter.equal(centimeter));
    }
}
