import org.bootcamp.Centimeter;
import org.bootcamp.Meter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CentimeterTest {

    @Test
    public void shouldReturnSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter = new Centimeter(centimeterLength);
        assertTrue(centimeter.isSame(centimeter));    }

    @Test
    public void shouldReturnNotSameWhenSameObjectCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter1 = new Centimeter(centimeterLength);
        Centimeter centimeter2 = new Centimeter(centimeterLength);
        assertFalse(centimeter1.isSame(centimeter2));
    }

    @Test
    public void shouldReturnEqualWhenEqualValueObjectsAreCompared(){
        Double centimeterLength = 1.0;

        Centimeter centimeter1 = new Centimeter(centimeterLength);
        Centimeter centimeter2 = new Centimeter(centimeterLength);
        assertTrue(centimeter2.equals(centimeter1));
    }

    @Test
    public void shouldReturnNotEqualWhenDifferentValueObjectsAreCompared(){
        Double centimeterLength1 = 1.0;
        Double centimeterLength2 = 2.0;
        Centimeter centimeter1 = new Centimeter(centimeterLength1);
        Centimeter centimeter2 = new Centimeter(centimeterLength2);
        assertFalse(centimeter1.equals(centimeter2));
    }

    @Test
    public void shouldReturnEqualWhen1cmAnd100meterAreCompared(){
        Double centimeterLength = 1.0;
        Double meterLength = 100.0;
        Centimeter centimeter = new Centimeter(centimeterLength);
        Meter meter = new Meter(meterLength);
        assertTrue(centimeter.equals(meter));
    }


}
