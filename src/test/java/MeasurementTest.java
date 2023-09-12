import org.bootcamp.Centimeter;
import org.bootcamp.Measurement;
import org.bootcamp.Meter;
import org.bootcamp.Unit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {

    @Test
    public void shouldReturnSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Measurement measurement = new Measurement(Unit.CENTIMETER, centimeterLength);
        assertTrue(measurement.isSame(measurement));    }

    @Test
    public void shouldReturnNotSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Measurement measurement1 = new Measurement(Unit.CENTIMETER, centimeterLength);
        Measurement measurement2 = new Measurement(Unit.CENTIMETER, centimeterLength);
        assertFalse(measurement1.isSame(measurement2));
    }

    @Test
    public void shouldReturnEqualWhenEqualValueObjectsAreCompared(){
        Double centimeterLength = 1.0;

        Measurement measurement1 = new Measurement(Unit.CENTIMETER, centimeterLength);
        Measurement measurement2 = new Measurement(Unit.CENTIMETER, centimeterLength);
        assertTrue(measurement1.equals(measurement2));
    }

    @Test
    public void shouldReturnNotEqualWhenDifferentValueObjectsAreCompared(){
        Double centimeterLength1 = 1.0;
        Double centimeterLength2 = 2.0;
        Measurement measurement1 = new Measurement(Unit.CENTIMETER, centimeterLength1);
        Measurement measurement2 = new Measurement(Unit.CENTIMETER, centimeterLength2);
        assertFalse(measurement1.equals(measurement2));
    }

    @Test
    public void shouldReturnEqualWhen1cmAnd100meterAreCompared(){
        Double centimeterLength = 100.0;
        Double meterLength = 1.0;
        Measurement centimeter = new Measurement(Unit.CENTIMETER, centimeterLength);
        Measurement meter = new Measurement(Unit.METER, meterLength);
        assertTrue(centimeter.equals(meter));
    }

    @Test
    public void shouldReturnNotEqualWhen2cmAnd100meterAreCompared(){

        Double centimeterLength = 200.0;
        Double meterLength = 1.0;
        Measurement centimeter = new Measurement(Unit.CENTIMETER, centimeterLength);
        Measurement meter = new Measurement(Unit.METER, meterLength);
        assertFalse(centimeter.equals(meter));
    }

    @Test
    public void shouldReturn3MeterWhen1MeterAnd200CentimeterAreAdded(){
        Double centimeterLength = 200.0;
        Double meterLength = 1.0;
        Measurement centimeter = new Measurement(Unit.CENTIMETER, centimeterLength);
        Measurement meter = new Measurement(Unit.METER, meterLength);

        Measurement result = new Measurement(Unit.CENTIMETER, 300.0);

        assertEquals(result, centimeter.add(meter));
    }

    @Test
    public void shouldReturn300CentemeterWhen100CentiMeterAnd2MeterAreAdded(){
        Double length1 = 100.0;
        Double length2 = 2.0;
        Measurement centimeter = new Measurement(Unit.CENTIMETER, length1);
        Measurement meter2 = new Measurement(Unit.METER, length2);
        Measurement result = new Measurement(Unit.CENTIMETER, 300.0);

        assertEquals(result, centimeter.add(meter2));
    }


}
