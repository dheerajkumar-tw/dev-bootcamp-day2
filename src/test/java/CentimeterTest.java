import org.bootcamp.Centimeter;
import org.bootcamp.Meter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentimeterTest {

    @Test
    public void shouldReturnSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter = new Centimeter(centimeterLength);

        String result = "Same";
        assertEquals(result, centimeter.compare(centimeter));
    }

    @Test
    public void shouldReturnNotSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter1 = new Centimeter(centimeterLength);
        Centimeter centimeter2 = new Centimeter(centimeterLength);
        String result = "Not Same";
        assertEquals(result, centimeter1.compare(centimeter2));
    }

    @Test
    public void shouldReturnEqualWhenEqualValueObjectsAreCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter1 = new Centimeter(centimeterLength);
        Centimeter centimeter2 = new Centimeter(centimeterLength);
        String result = "Equal";
        assertEquals(result, centimeter1.equal(centimeter2));
    }

    @Test
    public void shouldReturnNotEqualWhenDifferentValueObjectsAreCompared(){
        Double centimeterLength1 = 1.0;
        Double centimeterLength2 = 2.0;
        Centimeter centimeter1 = new Centimeter(centimeterLength1);
        Centimeter centimeter2 = new Centimeter(centimeterLength2);
        String result = "Not Equal";
        assertEquals(result, centimeter1.equal(centimeter2));
    }

    @Test
    public void shouldReturnEqualWhen1cmAnd100meterAreCompared(){
        Double centimeterLength = 1.0;
        Double meterLength = 100.0;
        Centimeter centimeter = new Centimeter(centimeterLength);
        Meter meter = new Meter(meterLength);
        String result = "Equal";
        assertEquals(result, centimeter.equal(meter));
    }


}
