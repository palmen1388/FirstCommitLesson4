package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {

    @Test
    public void setUserTemperatureSignature() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.setUserTemperatureSignature("f");
        assertEquals("f", temperatureConverter.getUserTemperatureSignature());
    }

    @Test
    public void convertTo() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.setUserTemperatureSignature("c");
        temperatureConverter.setUserTemperatureValue(10f);
        assertEquals("c", temperatureConverter.getUserTemperatureSignature());
        temperatureConverter.convertTo();
        assertEquals(50.0,temperatureConverter.convertTo());
    }
}