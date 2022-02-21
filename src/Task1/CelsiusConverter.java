package Task1;

public class CelsiusConverter implements Converter {
    private float celsiusTemperature;


    @Override
    public float convert(TemperatureConverter temperatureConverter) {
        celsiusTemperature = (temperatureConverter.getUserTemperatureValue() - 32) * 5 / 9;
        return celsiusTemperature;
    }
}
